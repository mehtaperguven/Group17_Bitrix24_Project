package com.automation.tests;


import com.automation.pages.LoginPage;
import com.automation.pages.main.MainPage;
import com.automation.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopicIconTest extends AbstractBaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    @Test
    public void topicIcon_test(){
        extentTest = extentReports.createTest("Verify Post Topic");

        loginPage.login();
        BrowserUtilities.wait(3);
        //System.out.println(driver.getTitle());
        //driver.findElement(By.xpath("//tbody//span[text()='Message']")).click();
        mainPage.clickToSendMessage();
        BrowserUtilities.wait(3);
        mainPage.clickToTopicIcon();
        BrowserUtilities.wait(3);
        String topicTitle = mainPage.getTopicInTitleText();
        System.out.println("topicTitle = " + topicTitle);
        Assert.assertEquals(topicTitle,"Topic");
        extentTest.pass("Topic Title verified");
    }
}
