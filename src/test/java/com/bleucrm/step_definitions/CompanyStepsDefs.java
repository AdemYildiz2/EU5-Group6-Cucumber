package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.CompanyPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class CompanyStepsDefs {

    @Given("the user clicks the Company label")
    public void the_user_clicks_the_Company_label() {
        new ActivityStreamPage().navigateToModule("Company");

    }

    @Given("the user clicks the add news")
    public void the_user_clicks_the_add_news() {
         CompanyPage companyPage = new CompanyPage();
         BrowserUtils.waitFor(1);
         companyPage.addNews.click();
        //Driver.get().findElement(By.xpath("//*[@id=\"bx_intranet_toolbar\"]/a[1]/span[2]")).click();

    }

    @Given("the user selects the Type of information as Notice")
    public void the_user_selects_the_Type_of_information_as_Notice() {


    }

    @Then("the user should be able to see the Notice as selected")
    public void the_user_should_be_able_to_see_the_Notice_as_selected() {

    }
    @Given("the user enters the {string}")
    public void the_user_enters_the(String addDate) throws InterruptedException {
        CompanyPage companyPage = new CompanyPage();
        companyPage.addDate.clear();
        Thread.sleep(3000);
        companyPage.addDate.sendKeys(addDate);

    }


}
