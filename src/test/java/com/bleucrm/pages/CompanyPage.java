package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CompanyPage extends BasePage {
    public CompanyPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"bx_intranet_toolbar\"]/a[1]/span[2]")
    public WebElement addNews;

    @FindBy(css = "input.adm-input.adm-input-calendar")
    public WebElement addDate;

    @FindBy(xpath = "//*[@id=\"tr_NAME\"]/td[2]/input")
    public WebElement addTitle;

}
