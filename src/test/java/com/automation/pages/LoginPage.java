package com.automation.pages;

import com.automation.utilities.BrowserUtilities;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractBasePageDONT_TOUCH {

    @FindBy(name="USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement login;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[contains(text(),'Incorrect login or password')]")
    public WebElement warningMessage;

    public LoginPage(){//constructor to connect our WebDriver, page class and PageFactory
        //PageFactory is used for @FindBy annotations
        //PageFactory helps to find elements easier

        PageFactory.initElements(Driver.getDriver(),this);
    }

//Login as a specific user
    public void login(String usernameValue, String passwordValue){

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    public void login(){

        username.sendKeys(ConfigurationReader.getProperty("user1"));
        password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }
    public String getWarningMessageText() {
        return warningMessage.getText();
    }


}
