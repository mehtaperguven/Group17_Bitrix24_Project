package com.automation.pages.contact;

import com.automation.pages.AbstractBasePageDONT_TOUCH;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactCenterPage extends AbstractBasePageDONT_TOUCH {


    @FindBy(css = "[class='intranet-contact-item']")
    private WebElement mail;

    @FindBy(linkText = "'/mail/config/new?id=2'\t")
    private WebElement gmail;

    @FindBy(id = "pagetitle")
    private WebElement contactCenterTitle;

    @FindBy(xpath = "//span[contains(text(),'Mailbox Integration')]']")
    private WebElement mailBoxTitle;

    @FindBy(id = "'mail_connect_mb_email_field'")
    private WebElement gMailEmailBox;

    @FindBy(id = "'mail_connect_save_btn'")
    private WebElement gMailConnectBtn;

    public String getMailTitleText() {

        return mailBoxTitle.getText();
    }

    public String getContactCenterTitle(){
        return contactCenterTitle.getText();
    }

//    public void enterMailTitleText(String titleValue) {
//
//        wait.until(ExpectedConditions.visibilityOf(mailTitle)).sendKeys(titleValue);
//    }
    public void clickToMail(){
        mail.click();
    }
    public void clickToGmail(){
        gmail.click();
    }

}
