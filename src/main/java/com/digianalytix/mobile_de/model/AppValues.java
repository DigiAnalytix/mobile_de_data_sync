package com.digianalytix.mobile_de.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppValues {

    @Value("${searchapi.url}")
    String url;


    public String getUrl() {
        return url;
    }

}
