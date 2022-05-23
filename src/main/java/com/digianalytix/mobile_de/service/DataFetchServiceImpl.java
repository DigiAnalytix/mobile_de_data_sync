package com.digianalytix.mobile_de.service;

import com.digianalytix.mobile_de.ApplicationException;
import com.digianalytix.mobile_de.model.AppValues;
import com.digianalytix.mobile_de.xml.ParkingAssistant;
import com.digianalytix.mobile_de.xml.ad.Ad;
import com.digianalytix.mobile_de.xml.search.SearchResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class DataFetchServiceImpl implements DataFetchService {

    private static final String SEARCH_ENDPOINT = "search";
    private static final String AD_ENDPOINT = "ad/";
    private final RestTemplate restTemplate;
    private final AppValues appValues;
    private final Unmarshaller searchResponseUnmarshaller;
    private final Unmarshaller adResponseUnmarshaller;

    @Autowired
    public DataFetchServiceImpl(AppValues appValues) throws JAXBException {
        this.restTemplate = new RestTemplate();
        this.appValues = appValues;
        this.searchResponseUnmarshaller = JAXBContext.newInstance(SearchResult.class).createUnmarshaller();
        this.adResponseUnmarshaller = JAXBContext.newInstance(Ad.class).createUnmarshaller();
    }

    public SearchResult getSearchResult(LocalDateTime fromDate) throws ApplicationException {
        SearchResult searchResult = null;
        int pageNumber = 1;
        while (true) {
            SearchResult tempResult = fetchResults(fromDate, pageNumber++);
            List<Ad> ads = fetchAds(tempResult);
            if (searchResult == null) {
                tempResult.getAds().getAd().clear();
                searchResult = tempResult;
            }
            if (!ads.isEmpty()) {
                searchResult.getAds().getAd().addAll(ads);
            }
            if (tempResult.getCurrentPage() == searchResult.getMaxPages()) {
                break;
            }
        }
        return searchResult;
    }

    private List<Ad> fetchAds(SearchResult tempResult) throws ApplicationException {
        List<Ad> ads = new ArrayList<>();
        if (tempResult.getAds() != null && tempResult.getAds().getAd() != null) {
            for (Ad ad : tempResult.getAds().getAd()) {
                ads.add(getAd(ad.getKey()));
            }
        }
        return ads;
    }

    private void doAdjustments(Ad ad) {
        // adjust power ad KW and do PS conversion
        if (ad.getVehicle().getSpecifics().getPower() != null) {
            ad.getVehicle().getSpecifics().getPower().setValueStr(
                    ad.getVehicle().getSpecifics().getPower().getValue() + "kW (" +
                            Math.round(ad.getVehicle().getSpecifics().getPower().getValue() * 1.36) + " PS)");
        }

        // exterior color
        if (ad.getVehicle().getSpecifics().getExteriorColor().getLocalDescription() != null) {
            ad.getVehicle().getSpecifics().getExteriorColor()
                    .setValueStr(ad.getVehicle().getSpecifics().getExteriorColor().getLocalDescription()
                            .getContent() + (ad.getVehicle().getSpecifics().getExteriorColor()
                            .getMetalic() != null && ad.getVehicle().getSpecifics().getExteriorColor().getMetalic()
                            .isValue() ? " Metallic" : ""));
        }

        //parking assistance
        if (ad.getVehicle().getSpecifics().getParkingAssistants() != null && ad.getVehicle().getSpecifics()
                .getParkingAssistants().getParkingAssistant() != null) {
            StringBuilder prValueBuilder = new StringBuilder();
            for (int i = 0; i < ad.getVehicle().getSpecifics().getParkingAssistants().getParkingAssistant()
                    .size(); i++) {
                if (i != 0) {
                    prValueBuilder.append(", ");
                }
                String paValue = ad.getVehicle().getSpecifics().getParkingAssistants().getParkingAssistant().get(i)
                        .getKey();
                prValueBuilder.append(ParkingAssistant.valueOf(paValue).getDeContent());
            }
            ad.getVehicle().getSpecifics().getParkingAssistants().setParkingAssistantValue(prValueBuilder.toString());
        }
    }

    public SearchResult fetchResults(LocalDateTime from, int pageNumber) throws ApplicationException {
        SearchResult tempResult;
        try {
            SearchRequestParams requestParams = new SearchRequestParams();
            requestParams.setModifiedFrom(from.toInstant(ZoneOffset.UTC));
            requestParams.setPageNumber(pageNumber);
            HttpEntity<String> request = getHttpHeaders();
            ResponseEntity<String> responseEntity = restTemplate
                    .exchange(appValues.getUrl() + SEARCH_ENDPOINT + requestParams
                            .getParamsAsQueryString(), HttpMethod.GET, request, String.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                tempResult = (SearchResult) searchResponseUnmarshaller.unmarshal(new StringReader(Objects
                        .requireNonNull(Objects.requireNonNull(responseEntity.getBody()).trim())));
                if (tempResult == null) {
                    log.error("Result is null ");
                    throw new ApplicationException("Temp Result is null for request" + appValues
                            .getUrl() + requestParams
                            .getParamsAsQueryString());
                }
            } else {
                log.error("Error while fetching data for request " + appValues
                        .getUrl() + SEARCH_ENDPOINT + requestParams
                        .getParamsAsQueryString() + ", error code", responseEntity
                        .getStatusCode() + " " + responseEntity
                        .getBody());
                throw new ApplicationException("Error while fetching data");
            }
        } catch (JAXBException ex) {
            throw new ApplicationException("Error while parsing search Response ", ex);
        } catch (RestClientException ex) {
            throw new ApplicationException("Error while fetching search data", ex);
        }

        return tempResult;
    }

    private HttpEntity<String> getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth("dlr_christopherbirke", "8RgxssRNLTxV");
        httpHeaders.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE);
        httpHeaders.add(HttpHeaders.ACCEPT_LANGUAGE, "de");
        return new HttpEntity<>(httpHeaders);
    }

    private Ad getAd(String adKey) throws ApplicationException {
        Ad ad;
        HttpEntity<String> request = getHttpHeaders();
        String url = appValues.getUrl() + AD_ENDPOINT + adKey;
        try {
            ResponseEntity<String> responseEntity = restTemplate
                    .exchange(url, HttpMethod.GET, request, String.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                ad = (Ad) adResponseUnmarshaller.unmarshal(new StringReader(Objects
                        .requireNonNull(Objects.requireNonNull(responseEntity.getBody()).trim())));
                if (ad == null) {
                    log.error("Result is null for request" + url);
                    throw new ApplicationException("Ad Result is null for request" + url);
                }
            } else {
                log.error("Error while fetching data for request " + url + ", error code", responseEntity
                        .getStatusCode() + " " + responseEntity.getBody());
                throw new ApplicationException("Error while fetching data ");
            }
        } catch (JAXBException ex) {
            log.error("Error while parsing AD Response for request : " + url, ex);
            throw new ApplicationException("Error while parsing AD Response for request : " + url, ex);
        } catch (RestClientException ex) {
            log.error("Error while fetching Ad data for request :" + url, ex);
            throw new ApplicationException("Error while fetching Ad data for request :" + url, ex);
        }
        doAdjustments(ad);
        return ad;
    }
}
