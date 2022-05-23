package com.digianalytix.mobile_de.service;

import com.digianalytix.mobile_de.ApplicationException;
import com.digianalytix.mobile_de.xml.search.SearchResult;

import java.time.LocalDateTime;

public interface DataFetchService {
    SearchResult getSearchResult(LocalDateTime fromDate) throws ApplicationException;


}
