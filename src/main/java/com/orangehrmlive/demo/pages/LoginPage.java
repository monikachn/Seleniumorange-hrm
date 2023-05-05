package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.tagName("button");
    By getTextLogin = By.xpath("//h5[text()='Login']");
    By logoOfOrangeHRM = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");

    public void loginToApplication() {
        sendTextToElement(userName, "Admin");
        sendTextToElement(password, "admin123");
        clickOnElement(loginButton);
    }

    public void enterUserName() {
        sendTextToElement(userName, "Admin");
    }

    public void enterPassword() {
        sendTextToElement(password, "admin123");
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
    public String verifyTextLogin(){
        return getTextFromElement(getTextLogin);
    }
    public String verifyLogoOfOrangeHRM(){
        return getTextFromElement(logoOfOrangeHRM);
    }
}
