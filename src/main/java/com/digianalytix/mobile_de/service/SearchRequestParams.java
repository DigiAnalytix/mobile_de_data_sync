package com.digianalytix.mobile_de.service;

import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class SearchRequestParams {
    static String PARAM_PAGE_NUMBER = "page.number";
    static String PARAM_PAGE_SIZE = "page.size";
    static String PARAM_SORT_FIELD = "sort.field";
    static String PARAM_SORT_ORDER = "sort.order";
    static String PARAM_MODIFIED_TIME_MIN = "modificationTime.min";

    Map<String, String> params = new HashMap<>();

    public SearchRequestParams() {
        //default values
        params.put(PARAM_PAGE_NUMBER, String.valueOf(1));
        params.put(PARAM_PAGE_SIZE, String.valueOf(100));
    }

    public void setPageNumber(int pageNumber) {
        params.put(PARAM_PAGE_NUMBER, String.valueOf(pageNumber));
    }

    public void setPageSize(int pageSize) {
        params.put(PARAM_PAGE_SIZE, String.valueOf(pageSize));
    }

    public void setSortFieldAndOrder(String sortField, SortOrder sortOrder) {
        params.put(PARAM_SORT_FIELD, sortField);
        params.put(PARAM_SORT_ORDER, sortOrder.name());
    }

    public void setModifiedFrom(Instant modifiedFrom) {
        params.put(PARAM_MODIFIED_TIME_MIN,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneId.systemDefault())
                        .format(modifiedFrom));
    }

    public String getParamsAsQueryString() {
        StringBuilder paramsBuilder = new StringBuilder();
        for (Map.Entry<String, String> keyVal : params.entrySet()) {
            if (paramsBuilder.length() > 0) {
                paramsBuilder.append("&");
            } else {
                paramsBuilder.append("?");
            }
            paramsBuilder.append(String.format("%s=%s",
                    keyVal.getKey(),
                    keyVal.getValue()
            ));
        }
        return paramsBuilder.toString();
    }

    static enum SortOrder {
        ASCENDING,
        DESCENDING
    }


}
