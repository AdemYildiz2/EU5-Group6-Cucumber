package com.bleucrm.step_definitions;

import com.bleucrm.pages.CompanyStructure;
import com.bleucrm.pages.DashboardPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CompanyStructureStepDefs {
    //Company Structure,Find Employee, Staff Changes, Efficiency Report, More
    @Then("The user click the {string} button")
    public void the_user_click_the_button(String tabName) {
        CompanyStructure companyStructure=new CompanyStructure();
        companyStructure.clickMenuOptions(tabName);
        BrowserUtils.waitFor(2);
    }

    @And("The user get {string} text")
    public void the_user_get_text(String expected) {
        CompanyStructure companyStructure=new CompanyStructure();
        String actual=companyStructure.companyStructureText.getText();
        System.out.println(companyStructure.companyStructureText.getText());
        Assert.assertEquals(expected,actual);
    }

    @When("The user send {string} text")
    public void the_user_send_text(String expected) {
        CompanyStructure companyStructure = new CompanyStructure();
        companyStructure.searchBox.sendKeys(expected);
        BrowserUtils.waitFor(2);
        companyStructure.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @When("The user click the Add Department")
    public void the_user_click_the_Add_Department() {
        CompanyStructure companyStructure = new CompanyStructure();
        companyStructure.addDepartment.click();
        BrowserUtils.waitFor(1);
    }

    @Then("The user add a new {string}")
    public void the_user_add_a_new(String newDepartmentName) {
        CompanyStructure companyStructure = new CompanyStructure();
        companyStructure.addDepartment.click();
        companyStructure.addDepartmentName.sendKeys(newDepartmentName);
        companyStructure.clickAddNewDepartment.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The user delete the {string}")
public void the_user_delete_the(String departmentName) {
        CompanyStructure companyStructure = new CompanyStructure();
        companyStructure.deleteDepartment(departmentName);
    }




}
