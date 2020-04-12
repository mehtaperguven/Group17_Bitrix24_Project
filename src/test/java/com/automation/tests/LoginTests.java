package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends AbstractBaseTest {

    @Test
    public void login(){
        extentTest = extentReports.createTest("Verify Title");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtilities.wait(3);
        //System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Portal");
        extentTest.pass("Title name verified");
    }

    @Test
    public void navigationTest(){
        extentTest = extentReports.createTest("Is navigating");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtilities.wait(3);
        loginPage.navigateTo("Activity Stream");

        extentTest.pass("Yes it is!");
    }
}
