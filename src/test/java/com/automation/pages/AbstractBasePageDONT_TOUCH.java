package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractBasePageDONT_TOUCH {
protected WebDriver driver= Driver.getDriver();
protected WebDriverWait wait=new WebDriverWait(driver,15);

@FindBy(id = "sitemap-menu")
protected WebElement sitemapMenu;

@FindBy(id = "logo_24_text")
protected WebElement logo24;

@FindBy(id = "search-textbox-input")
protected WebElement searchBox;

@FindBy(id = "timeman-background")
protected WebElement timer;

@FindBy(id = "user-block")
protected WebElement currentUser;

@FindBy(id = "bx-help-block")
protected WebElement helpBtn;

public AbstractBasePageDONT_TOUCH(){

    PageFactory.initElements(driver,this);
}
public void navigateTo(String component){
    String locator = "//span[contains(text(),'" + component + "')]";
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();

}

public WebElement getLogo24(){
    return logo24;
}


}
