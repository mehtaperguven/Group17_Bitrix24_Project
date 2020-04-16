package com.automation.tests.contactCenter;

import com.automation.pages.LoginPage;
import com.automation.pages.contact.ContactCenterPage;
import com.automation.tests.AbstractBaseTestDONT_TOUCH;
import com.automation.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCenterTest extends AbstractBaseTestDONT_TOUCH {

    LoginPage loginPage = new LoginPage();
    ContactCenterPage contactCenterPage = new ContactCenterPage();


    private Actions actions;

    @Test
    public void verifyContactCenterTitle(){

        extentTest = extentReports.createTest("VerifyContactCenterTitle");
        loginPage.login();
        BrowserUtilities.wait(2);
        contactCenterPage.navigateTo( "Contact Center" );

        String contactCenterTitle = contactCenterPage.getContactCenterTitle();
        System.out.println("contactCenterTitle = " + contactCenterTitle);
        Assert.assertEquals(contactCenterTitle,"Contact Center");
        extentTest.pass("Topic Title verified");

    }
    @Test
    public void verifyMailTitle(){

        extentTest = extentReports.createTest("VerifyMailTitle");
        loginPage.login();
        BrowserUtilities.wait(2);
        contactCenterPage.navigateTo( "Contact Center" );
        contactCenterPage.clickToMail();

        loginPage.navigateTo("Mail");
//        driver.navigate().to( "https://login1.nextbasecrm.com/services/contact_center/" );
//        contactCenterPage.getMailTitleText();
//       String title =  driver.findElement( By.xpath( "//span[contains(text(),'Mailbox Integration')]" ) ).getText();
//
//
//
//       Assert.assertEquals(title, "Mailbox Integration");

    }

    @Test
    public void den(){
        extentTest = extentReports.createTest("VerifyMailTitle");
        loginPage.login();
        BrowserUtilities.wait(2);
        contactCenterPage.navigateTo( "Contact Center" );
        contactCenterPage.clickToMail();
        contactCenterPage.clickToGmail();
    }

}
