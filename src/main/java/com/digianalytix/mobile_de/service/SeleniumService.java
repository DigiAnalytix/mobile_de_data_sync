package com.digianalytix.mobile_de.service;

import com.digianalytix.mobile_de.selenium.DriverManager;
import com.digianalytix.mobile_de.selenium.HomePage;
import com.digianalytix.mobile_de.selenium.ImportPage;
import com.digianalytix.mobile_de.selenium.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SeleniumService {
    @Value("${wordpress.url}")
    String wordPressUrl;
    LoginPage loginPage;
    HomePage homePage;
    ImportPage importPage;
    static {
        System.setProperty("java.awt.headless", "false");
    }
    public void execute(String resultsFileLocation) throws Exception {
        WebDriver driver = DriverManager.getInstance();
        driver.manage().window().maximize();
        initializePages(driver);
        try {
            loginPage.navigateTo();
            loginPage.login("admin", "c4TDS0kS6YvbfKj#r5b!(7ab");
        }catch (Exception ex){
            log.error("Error while logging into app",ex);
        }
        importPage.navigateTo();
        importPage.setFilePath(resultsFileLocation);
        importPage.advance();
    }

    private void initializePages(WebDriver driver) {
        loginPage = new LoginPage(driver, wordPressUrl);
        homePage = new HomePage(driver, wordPressUrl);
        importPage = new ImportPage(driver, wordPressUrl);
    }

}
