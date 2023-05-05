package com.orangehrmlive.demo.pages;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By getTextSystemUser = By.xpath("//h5[text()='System Users']");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By userNameInRecord = By.xpath("//div[contains(text(),'Varun')]");
    By checkBox = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]");
    By deleteSign = By.xpath("//i[@class='oxd-icon bi-trash']");
    By clickOnDelete1 = By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']");
    public String verifyTextSystemUser() {
        return getTextFromElement(getTextSystemUser);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public String verifyUserShouldBeInRecordList(){
        return getTextFromElement(userNameInRecord);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnDelete(){
        clickOnElement(deleteSign);
    }
    public void acceptPopUpDisplay(){
        clickOnElement(clickOnDelete1);
    }
}
