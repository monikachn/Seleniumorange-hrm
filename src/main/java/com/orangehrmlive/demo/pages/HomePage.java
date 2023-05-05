package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
        By admin = By.xpath("//span[text()='Admin']");
        public void clickOnAdmin(){
            clickOnElement(admin);
        }
}
