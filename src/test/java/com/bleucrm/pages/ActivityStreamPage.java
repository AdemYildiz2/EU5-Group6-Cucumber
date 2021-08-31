package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

    @FindBy(xpath = "(//a[contains(text(),'Add comment')])[1]")
    public WebElement addComment;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement TextBoxiFrame;

    @FindBy(xpath = "//body")
    public WebElement IframeTextBox;

    @FindBy(xpath = "(//button[contains(text(),'Send')])[1]")
    public WebElement textBoxSend;

    public void switchToIframe(String keys){
        Driver.get().switchTo().frame(TextBoxiFrame);
        IframeTextBox.sendKeys(keys);
    }

}
