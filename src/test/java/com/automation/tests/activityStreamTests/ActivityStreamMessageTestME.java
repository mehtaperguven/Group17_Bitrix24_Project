package com.automation.tests.activityStreamTests;

import com.automation.pages.LoginPage;
import com.automation.tests.AbstractBaseTestDONT_TOUCH;
import com.automation.utilities.BrowserUtilities;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActivityStreamMessageTestME extends AbstractBaseTestDONT_TOUCH {


    protected WebDriverWait wait;
    protected Actions actions;
    private WebDriver driver=Driver.getDriver();
    @BeforeMethod
    public void setup(){

        String URL= ConfigurationReader.getProperty("qa1");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait=new WebDriverWait(Driver.getDriver(),25);
        actions=new Actions(Driver.getDriver());

    }

    @Test
    public void test1(){
        //send message, if you send more than 1 same message verify that warning message appears

        LoginPage loginPage=new LoginPage();
        loginPage.login();
        //BrowserUtils.wait(4);
        String title=driver.getTitle();
        System.out.println("title is "+title);
        //BrowserUtils.wait(2);

        driver.navigate().to("https://login1.nextbasecrm.com/stream/");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        driver.findElement(By.cssSelector("[id='feed-add-post-form-tab-message']>span")).click();
        BrowserUtilities.wait(3);
        driver.switchTo().frame(0);
        String str="Please Don't give up!";
        driver.findElement(By.cssSelector("body[contenteditable=\"true\"]")).sendKeys(str);
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("#blog-submit-button-save")).click();
        BrowserUtilities.wait(2);
        WebElement elm=driver.findElement(By.xpath("(//div[starts-with(@id,'blog_post_body_')])[1]"));
        String str1= elm.getText();
        BrowserUtilities.wait(2);
        System.out.println(">>>"+str1);
        String str2=driver.findElement(By.cssSelector("[class=\"feed-add-info-text\"]")).getText();


        Assert.assertEquals(str2,"You have already added your post");

    }


    @AfterMethod
    public void close(){
        BrowserUtilities.wait(3);
        Driver.closeDriver();
    }




}
