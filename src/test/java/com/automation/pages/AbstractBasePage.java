package com.automation.pages;


import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractBasePage {
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

public AbstractBasePage(){

    PageFactory.initElements(driver,this);
}

public void navigateTo(String component){
    String locator = "//span[contains(text(),'" + component + "')]";
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();

}

public WebElement getLogo24(){
    return logo24;
}




//public void navigateTo(String tabName, String moduleName){
//
//    String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'" + tabName + "')]";
//    String moduleXpath = "//span[@class='title title-level-2' and text()='" + moduleName + "']";
//
//    WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
//    WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));
//
//    Actions actions=new Actions(driver);
//    BrowserUtilities.wait(4);
//
//    actions.moveToElement(tabElement).
//            pause(2000).
//            click(moduleElement).
//            build().perform();
//    BrowserUtilities.wait(4);
//}

}
