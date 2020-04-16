package com.automation.pages.ActivityStream;

import com.automation.pages.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends AbstractBasePage {

    @FindBy(xpath = "//tbody//span[text()='Message']")
    private WebElement messageButton;

    @FindBy(id = "lhe_button_title_blogPostForm")
    private WebElement topicIcon;

    @FindBy(id = "POST_TITLE")
    private WebElement topicInTitle;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    private WebElement cancelButton;

    @FindBy(className = "feed-add-post-form-link-text")
    private WebElement moreButton;

    @FindBy(xpath = "//span[text()='All employees']")
    private WebElement allEmployeesButton;

    @FindBy(css = "body[contenteditable=\"true\"]")
    private WebElement messageFrame;



    public String getTopicInTitleText(){
        return topicInTitle.getAttribute("placeholder");
    }
    public void clickToMessageButton(){
        messageButton.click();
    }
    public void clickToTopicIcon(){
        topicIcon.click();
    }
    public void clickToSendButton(){
        sendButton.click();
    }

    public void clickToCancelButton(){
        cancelButton.click();
    }

    public void clickToMoreButton(){
        moreButton.click();
    }

    public void enterFrame(String str){
        messageFrame.sendKeys(str);
    }
}
