package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility{
    By getTextAddUserName = By.xpath("//h6[text()='Add User']");
    By selectUserRole = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By selectAdminInUserRole = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By enterEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By getEnterEmployeeName = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Varun Raj Sharma')]");
    By enterUserNameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By selectStatus = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    By selectDisable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By selectEnable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By enterPassword = By.xpath("(//input[@type='password'])[1]");
    By enterConfirmPassword = By.xpath("(//input[@type='password'])[2]");
    By saveButton = By.xpath("//button[text()=' Save ']");
    //By statusSelect = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    //By selectDisable1 = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By searchButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By getTextNoRecord = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");
    By selectAdminDrop2 = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By selectAdmin2 = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By selectStatus2 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By selectDisable2 = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

    public String verifyTextAddUserName() {
        return getTextFromElement(getTextAddUserName);
    }

    public void selectAdminForUserRole() {
        clickOnElement(selectUserRole);
        clickOnElement(selectAdminInUserRole);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(enterEmployeeName, "Varun");
   
        clickOnElement(getEnterEmployeeName);
    }

    public void enterUserName() {
        sendTextToElement(enterUserNameField, "Varun");
    }

    public void selectStatusDisable() {
        clickOnElement(selectStatus);
        clickOnElement1(selectDisable);
    }

    public void selectStatusEnable() {
        clickOnElement(selectStatus);
        clickOnElement(selectEnable);
    }

    public void enterPassword() {
        sendTextToElement(enterPassword, "Qwe@12345");
    }

    public void enterConfirmPassword() {
        sendTextToElement(enterConfirmPassword, "Qwe@12345");
    }

    public void clickOnSave() {
        clickOnElement(saveButton);
    }

    public void clickSearchButton() {
        clickOnElement(searchButton);
    }

    public String verifyNotRecord() {
        return getTextFromElement(getTextNoRecord);
    }

    public void selectAdminRole() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(selectAdminDrop2);
        Thread.sleep(1000);
        clickOnElement(selectAdmin2);
    }

    public void selectDisableOption() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(selectStatus2);
        Thread.sleep(1000);
        clickOnElement(selectDisable2);

    }
}

