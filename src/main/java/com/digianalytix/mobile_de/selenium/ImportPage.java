package com.digianalytix.mobile_de.selenium;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.digianalytix.mobile_de.selenium.Utils.*;

@Slf4j
public class ImportPage extends AbstractPage {
    By filePath = By.className("wpallimport-upload-type");
    By filePathInput = By.xpath("//input[@type='file']");
    By uploadType= By.xpath("//input[@name='type']");

    By ulDropDownList =By.xpath("//div[@id='custom_type_selector']/ul");
    //By ulDropDownList = By.xpath("//ul[contains(@class, 'dd-options') and contains(@class, 'dd-click-off-close')]");
    By ulDropDownContainer =By.id("custom_type_selector");
    By existingItemsButton=By.className("wpallimport-to-existing-items");
    By step2Button=By.id("advanced_upload");
    By step2AdSelectButton=By.xpath("//a[@rel='ns4_ad']");
    By step3Button=By.xpath("//input[@type='submit']");
    By step4Button=By.xpath("//input[@type='submit']");
    By step5ContinueButton=By.xpath("//input[@type='submit']");
    By step6ConfirmButton=By.xpath("//input[@type='submit']");
    By templateDropDown=By.id("load_template");
    By checkBoxSaveTemplate=By.xpath("//*[@id=\"save_template_as\"]");
    By radioButton=By.xpath("//*[@id=\"wpbody-content\"]/div[2]/div[1]/table/tbody/tr/td[1]/form/div/div[1]/div/div[2" +
            "]/div/table/tbody/tr/td/div[1]/div/div/div[1]/label");
    By CustomFieldName = By.xpath("//*[@id=\"wpbody-content\"]/div[2]/div[1]/table/tbody/tr/td[1]/form/div/div[1]/div" +
            "/div[2]/div/table/tbody/tr/td/div[1]/div/div/div[1]/span/input[1]");
    By CustomFieldValue = By.xpath("//*[@id=\"wpbody-content\"]/div[2]/div[1]/table/tbody/tr/td[1]/form/div/div[1" +
            "]/div/div[2]/div/table/tbody/tr/td/div[1]/div/div/div[1]/span/input[2]");

    public ImportPage(WebDriver driver, String webSiteBaseUrl) {
        super(driver, webSiteBaseUrl);
    }

    @Override
    public Pages getPage() {
        return Pages.IMPORT_PAGE;
    }

    public ImportPage setFilePath(String filePathValue) throws Exception {
        waitAndClickUploadFile(driver, filePath, uploadType,filePathValue);
        driver.findElement(filePathInput).sendKeys(filePathValue);
        log.info("set file name to input field complete");
        return this;
    }

    public ImportPage selectDropDownText(String text) {
        waitAndSelectUlDropdownValue(driver, ulDropDownContainer, ulDropDownList,text);
        return this;
    }
    public ImportPage advance() {
        waitAndClick(driver, existingItemsButton);
        pauseExecution(5);

        selectDropDownText("Angebote");
        pauseExecution(3);
        log.info("Angebote selection complete");
        waitAndClick(driver, step2Button);
        log.info("Step 2 button click complete");
        pauseExecution(3);
        waitAndClick(driver, step2AdSelectButton);
        log.info("Step 2 Ad selection button click complete");
        pauseExecution(3);
        waitAndClick(driver, step3Button);
        log.info("Step 3 button click complete");
        pauseExecution(3);
        waitAndSelectOptionDropdownValue(driver, templateDropDown, "Vehica2mobileNew");
        log.info("Step 3 vehica template selection complete");
        pauseExecution(3);
        waitAndSelectCheckBox(driver, checkBoxSaveTemplate);
        pauseExecution(3);

        log.info("Step 3 uncheck template check box complete");
        waitAndClick(driver, step4Button);
        log.info("Step 4 button click complete");
        pauseExecution(2);
        waitAndSelectRadioButton(driver,radioButton);
        log.info("Step 4 radio button selection  complete");

        waitAndEnterTextXpath(driver,CustomFieldName,"vehica_22428");
        waitAndEnterTextXpath(driver,CustomFieldValue,"[intval({./@key})]");

        pauseExecution(1);
        waitAndClick(driver, step5ContinueButton);
        log.info("Step 5 button click complete");
        pauseExecution(2);
        waitAndClick(driver, step6ConfirmButton);
        log.info("Step 6 confirm button click complete");
        return this;
        }



}
