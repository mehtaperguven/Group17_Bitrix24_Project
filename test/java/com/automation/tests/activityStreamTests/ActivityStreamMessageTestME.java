package com.automation.tests.activityStreamTests;

import com.automation.pages.ActivityStream.ActivityStreamPage;
import com.automation.pages.LoginPage;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStreamMessageTestME extends AbstractBaseTest {
    ActivityStreamPage activityStreamPage=new ActivityStreamPage();
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyPortalTitleTest() {

        extentTest = extentReports.createTest("Verify Title in Login Page");
        loginPage.login();
        String title = driver.getTitle();
        System.out.println("title is " + title);
        Assert.assertEquals(title, "Portal");
        extentTest.pass("Title is verified");
//.....................................................
    }

    @Test
    public void sendMessageTest() {

        extentTest = extentReports.createTest("Verify that message has been sent");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        // driver.navigate().to("https://login1.nextbasecrm.com/stream/?login=yes");
        activityStreamPage.clickToMessageButton();
        //driver.findElement(By.cssSelector("[id='feed-add-post-form-tab-message']>span")).click();
        BrowserUtilities.wait(3);

        driver.switchTo().frame(0);//frame enter
        String str = "We are working online!";
        activityStreamPage.enterFrame(str);
        driver.switchTo().defaultContent();//frame exit
        driver.findElement(By.id("bx-destination-tag")).click();
        driver.findElement(By.xpath("//span[text()=\"All employees\"]")).click();

        activityStreamPage.clickToSendButton();//send message
        BrowserUtilities.wait(3);
        String expected="Send message …";
        String actual=driver.findElement(By.xpath("//span[contains(text(),\"Send message\")]")).getText();
        Assert.assertEquals(actual,expected);
        extentTest.pass("message has been sent successfully");
    }



}
