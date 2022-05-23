package com.digianalytix.mobile_de.service;

import com.digianalytix.mobile_de.ApplicationException;
import com.digianalytix.mobile_de.domain.JobRecord;
import com.digianalytix.mobile_de.domain.JobStatus;
import com.digianalytix.mobile_de.repository.JobRecordRepository;
import com.digianalytix.mobile_de.xml.search.SearchResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@Transactional
public class DataSyncService {
    private final DataFetchService dataFetchService;
    private final JobRecordRepository jobRecordRepository;
    private final XMLFileSaver xmlFileSaver;
    private final SeleniumService seleniumService;

    @Autowired
    public DataSyncService(DataFetchService dataFetchService, JobRecordRepository jobRecordRepository,
                           XMLFileSaver xmlFileSaver,
                           SeleniumService seleniumService) {
        this.dataFetchService = dataFetchService;
        this.jobRecordRepository = jobRecordRepository;
        this.xmlFileSaver = xmlFileSaver;
        this.seleniumService = seleniumService;
    }

    @Scheduled(fixedRate = 6, timeUnit = TimeUnit.HOURS)
    @Async
    public void run() {
        jobRecordRepository.deleteOldRecords();
        JobRecord jobRecord = new JobRecord();
        try {
            SearchResult searchResult = fetchAds();
            if (!searchResult.getAds().getAd().isEmpty()) {
                xmlFileSaver.writeResultToXml(searchResult);
                seleniumService.execute(XMLFileSaver.getFilePath());
                Thread.sleep(TimeUnit.of(ChronoUnit.MINUTES).toMillis(10));
                jobRecord.setMessage("Number of new/modified records received from Mobile.de: " + searchResult.getAds()
                        .getAd().size());
            } else {
                jobRecord.setMessage("No new/modified ads found.");
            }
            jobRecord.setStatus(JobStatus.SUCCESS);
            jobRecordRepository.save(jobRecord);
        } catch (ApplicationException ex) {
            jobRecord.setStatus(JobStatus.FAILED);
            jobRecord.setMessage(ex.getMessage()
                    .substring(0, Math.min(ex.getMessage().length(), 4999)));
            jobRecordRepository.save(jobRecord);
        } catch (Exception ex) {
            log.error("Unknown exception occurred", ex);
            jobRecord.setStatus(JobStatus.FAILED);
            jobRecord.setMessage(ex.getMessage());
            jobRecordRepository.save(jobRecord);
        }
    }

    private SearchResult fetchAds() throws ApplicationException {
        Optional<LocalDateTime> lastSuccessfulRun = jobRecordRepository.getLastSuccessfulRun();
        return dataFetchService.getSearchResult(lastSuccessfulRun.orElse(LocalDateTime.now().minusDays(60)));
    }

}
