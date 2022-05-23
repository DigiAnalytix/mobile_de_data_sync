package com.digianalytix.mobile_de.selenium;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected final WebDriver driver;
    protected final String baseUrl;

    public AbstractPage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    private String getPageUrl() {
        return baseUrl + getPage().path;
    }

    public abstract Pages getPage();

    public void navigateTo() {
        driver.get(getPageUrl());
        Utils.pauseExecution(5);
    }
}
