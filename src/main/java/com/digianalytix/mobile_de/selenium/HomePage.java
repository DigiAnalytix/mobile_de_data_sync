package com.digianalytix.mobile_de.selenium;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver, String webSiteBaseUrl) {
        super(driver, webSiteBaseUrl);
    }

    @Override
    public Pages getPage() {
        return Pages.HOME_PAGE;
    }

}
