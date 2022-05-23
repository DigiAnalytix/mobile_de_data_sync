package com.digianalytix.mobile_de.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            WebDriverManager.chromedriver().browserVersion("100.0.4896.60");
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
//            options.addArguments("--headless");
            // options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
//            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.merge(capabilities);
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
