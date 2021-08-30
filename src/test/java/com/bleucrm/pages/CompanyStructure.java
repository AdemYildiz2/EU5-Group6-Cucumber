package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructure extends BasePage {
    public CompanyStructure() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "pagetitle")
    public WebElement companyStructureText;
    //Add new department
    @FindBy(css = "span.webform-small-button-text")
    public WebElement addDepartment;
    @FindBy(css = "#NAME")
    public WebElement addDepartmentName;
    @FindBy(css = "span.popup-window-button.popup-window-button-accept")
    public WebElement clickAddNewDepartment;
    //delete new department


    @FindBy(linkText = "Telephone Directory")
    public WebElement telephoneDirectory;
    @FindBy(id = "pagetitle")
    public WebElement telephoneDirectoryText;
    @FindBy(id = "search-textbox-input")
    public WebElement searchBox;







    public void clickMenuOptions(String tabName){
        Driver.get().findElement(By.linkText(tabName)).click();
    }

    //delete the department which is createb by automation under the company/add department
    public void deleteDepartment(String departmentName){
        WebElement department = Driver.get().findElement(By.xpath("//a[@title='"+departmentName+"']"));
        WebElement delete=  Driver.get().findElement(By.xpath("//table[@id='bx_str_level2_table']//div[@title='Delete department']"));
        Actions actions = new Actions(Driver.get());
        BrowserUtils.waitFor(3);
        actions.moveToElement(department).perform();
        BrowserUtils.waitFor(2);
        delete.click();
        Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(2);
        alert.accept();



    }

}
