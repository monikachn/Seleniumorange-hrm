package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By getTextDashBoard = By.xpath("//h6[text()='Dashboard']");
    By userProfilePhoto = By.xpath("(//img[@alt='profile picture'])[1]");
    By logOut = By.xpath("//a[contains(text(),'Logout')]");
    public String verifyTextDashBoard(){
        return getTextFromElement(getTextDashBoard);
    }
    public void clickOnUserProfilePhoto(){
        clickOnElement(userProfilePhoto);
    }
    public void mouseHoverAndClickOnLogOut(){
        mouseHoverToElementAndClick(logOut);
    }
}
