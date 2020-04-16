package com.automation.pages.employees;


import com.automation.pages.AbstractBasePageDONT_TOUCH;
import com.automation.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends AbstractBasePageDONT_TOUCH {

    @FindBy(xpath = "//tbody//span//*[text()='Company Structure']")
    private WebElement companyStructure;

    @FindBy(xpath ="//span//*[text()='Find Employee']" )
    private WebElement findEmployee;


    @FindBy(xpath = "//span//*[text()='Telephone Directory']")
    private WebElement telephoneDrectory;

    @FindBy(xpath = "//tbody//span//*[text()='Staff Changes']")
    private WebElement staffChanges;

    @FindBy(id = "Arben Istrefi")
    private WebElement employed;

 public String getcompanyStructure(){
     BrowserUtilities.waitForPageToLoad(20);
     return companyStructure.getText();

}

    public void clickToCompanyStructure() {
        companyStructure.click();
    }
}
