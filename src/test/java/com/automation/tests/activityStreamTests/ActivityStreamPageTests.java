package com.automation.tests.activityStreamTests;


import com.automation.pages.ActivityStream.ActivityStreamPage;
import com.automation.pages.LoginPage;
import com.automation.tests.AbstractBaseTestDONT_TOUCH;
import com.automation.utilities.BrowserUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStreamPageTests extends AbstractBaseTestDONT_TOUCH {
    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Test
    public void topicIcon_test(){
        extentTest = extentReports.createTest("Verify Post Topic");

        loginPage.login();
        BrowserUtilities.wait(3);
        //System.out.println(driver.getTitle());
        //driver.findElement(By.xpath("//tbody//span[text()='Message']")).click();
        activityStreamPage.clickToSendMessage();
        BrowserUtilities.wait(3);
        activityStreamPage.clickToTopicIcon();
        BrowserUtilities.wait(3);
        String topicTitle = activityStreamPage.getTopicInTitleText();
        System.out.println("topicTitle = " + topicTitle);
        Assert.assertEquals(topicTitle,"Topic");
        extentTest.pass("Topic Title verified");
    }

}
