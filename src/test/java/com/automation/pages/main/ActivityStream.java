package com.automation.pages.main;

import com.automation.pages.AbstractBasePage;
import com.automation.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStream extends AbstractBasePage {

    @FindBy(xpath = "//tbody//span[text()='Message']")
    private WebElement sendMessage;

    @FindBy(id = "lhe_button_title_blogPostForm")
    private WebElement topicIcon;

    @FindBy(id = "POST_TITLE")
    private WebElement topicInTitle;



    public String getTopicInTitleText(){
        return topicInTitle.getAttribute("placeholder");
    }
    public void clickToSendMessage(){
        sendMessage.click();
    }
    public void clickToTopicIcon(){
        topicIcon.click();
    }
}
