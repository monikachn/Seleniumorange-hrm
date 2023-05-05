package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();

    @Test
    //1.adminShouldAddUserSuccessFully().
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        //  Login to Application
        loginPage.loginToApplication();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifyTextSystemUser(), "System Users");
        //	click On "Add" button
        viewSystemUsersPage.clickOnAddButton();
        //	Verify "Add User" Text
        Assert.assertEquals(addUserPage.verifyTextAddUserName(), "Add User");
        //	Select User Role "Admin"
        addUserPage.selectAdminRole();
        //	enter Employee Name "Ananya Dash"
        addUserPage.enterEmployeeName();
        //	enter Username
        addUserPage.enterUserName();
        //	Select status "Disable"
        addUserPage.selectDisableOption();
        //	enter password
        addUserPage.enterPassword();
        //	enter Confirm Password
        addUserPage.enterConfirmPassword();
        //	click On "Save" Button
        addUserPage.clickOnSave();
        //	verify message "Successfully Saved"


    }

    @Test
    //2. searchTheUserCreatedAndVerifyIt().
    public void searchTheUserCreatedAndVerifyIt() {
        //	Login to Application
        loginPage.loginToApplication();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifyTextSystemUser(), "System Users");
        //	Enter Username
        addUserPage.enterUserName();
        //	Select User Role
        addUserPage.selectAdminForUserRole();
        //	Select Satatus
        addUserPage.selectStatusEnable();
        //	Click on "Search" Button
        addUserPage.clickSearchButton();
        //	Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyUserShouldBeInRecordList(), "Mohan");

    }

    @Test
    //3. verifyThatAdminShouldDeleteTheUserSuccessFully.
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        //	Login to Application
        loginPage.loginToApplication();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifyTextSystemUser(), "System Users");
        //	Enter Username
        addUserPage.enterUserName();
        //	Select User Role
        addUserPage.selectAdminForUserRole();
        //	Select Satatus
        addUserPage.selectStatusEnable();
        //	Click on "Search" Button
        addUserPage.clickSearchButton();
        //	Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyUserShouldBeInRecordList(), "Mohan");
        //	Click on Check box
        viewSystemUsersPage.clickOnCheckBox();
        //	Click on Delete Button
        viewSystemUsersPage.clickOnDelete();
        //	Popup will display
        //	Click on Ok Button on Popup
        viewSystemUsersPage.acceptPopUpDisplay();
        //	verify message "Successfully Deleted"

    }

    @Test
    //4. searchTheDeletedUserAndVerifyTheMessageNoRecordFound.
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        //	Login to Application
        loginPage.loginToApplication();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifyTextSystemUser(), "System Users");
        //	Enter Username
        addUserPage.enterUserName();
        //	Select User Role
        addUserPage.selectAdminForUserRole();
        //	Select Satatus
        addUserPage.selectStatusDisable();
        //	Click on "Search" Button
        addUserPage.clickSearchButton();
        //	verify message "No Records Found"
        addUserPage.verifyNotRecord();
    }
}
