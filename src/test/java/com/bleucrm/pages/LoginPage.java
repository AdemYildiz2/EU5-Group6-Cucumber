package com.bleucrm.pages;

import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[.='Incorrect login or password']")
    public WebElement IncorrectInput;

    public void login(String usernameStr, String passwordStr) {
        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginButton.click();
    }


}