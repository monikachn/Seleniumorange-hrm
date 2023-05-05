package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();

    @Test
    //1. verifyUserShouldLoginSuccessFully()
    public void verifyUserShouldLoginSuccessFully() {
        //   Enter username
        loginPage.enterUserName();
        //   Enter password
        loginPage.enterPassword();
        //   Click on Login Button
        loginPage.clickOnLogin();
        //   Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.verifyTextDashBoard(), "Dashboard");
    }

    @Test
    //2. VerifyThatTheLogoDisplayOnLoginPage()
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        //   Launch the application
        //   Verify Logo is Displayed
        Assert.assertEquals(loginPage.verifyLogoOfOrangeHRM(), "");

    }

    @Test
    //3. VerifyUserShouldLogOutSuccessFully()
    public void VerifyUserShouldLogOutSuccessFully() {
        //   Login To The application
        loginPage.loginToApplication();
        //   Click on User Profile logo
        dashboardPage.clickOnUserProfilePhoto();
        //   Mouse hover on "Logout" and click
        dashboardPage.mouseHoverAndClickOnLogOut();
        //   Verify the text "Login Panel" is displayed
        Assert.assertEquals(loginPage.verifyTextLogin(), "Login");
    }
}
