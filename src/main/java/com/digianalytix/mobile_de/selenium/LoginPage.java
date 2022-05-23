package com.digianalytix.mobile_de.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.digianalytix.mobile_de.selenium.Utils.waitAndClick;
import static com.digianalytix.mobile_de.selenium.Utils.waitAndEnterText;

public class LoginPage extends AbstractPage {
    private static final String LOGIN_PATH = "/wp-login.php";
    By emailText = By.id("user_login");
    By continueButton = By.id("wp-submit");
    By passwordText = By.id("user_pass");

    public LoginPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }

    @Override
    public Pages getPage() {
        return Pages.LOGIN_PAGE;
    }

    public LoginPage login(String username, String password) {
        waitAndEnterText(driver, emailText, username);
        waitAndEnterText(driver, passwordText, password);
        waitAndClick(driver, continueButton);
        return this;
    }

}
