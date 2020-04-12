package com.automation.tests;


import com.automation.pages.LoginPage;
import com.automation.pages.main.ActivityStream;
import com.automation.utilities.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopicIconTest extends AbstractBaseTest {
    LoginPage loginPage = new LoginPage();
    ActivityStream activityStream = new ActivityStream();
    @Test
    public void topicIcon_test(){
        extentTest = extentReports.createTest("Verify Post Topic");

        loginPage.login();
        BrowserUtilities.wait(3);
        //System.out.println(driver.getTitle());
        //driver.findElement(By.xpath("//tbody//span[text()='Message']")).click();
        activityStream.clickToSendMessage();
        BrowserUtilities.wait(3);
        activityStream.clickToTopicIcon();
        BrowserUtilities.wait(3);
        String topicTitle = activityStream.getTopicInTitleText();
        System.out.println("topicTitle = " + topicTitle);
        Assert.assertEquals(topicTitle,"Topic");
        extentTest.pass("Topic Title verified");
    }
}
