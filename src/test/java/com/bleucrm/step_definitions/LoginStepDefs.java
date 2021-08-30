package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }
    @When("The user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {


        if (userType.equals("help desk")) {
            String username = ConfigurationReader.get("hd_username");
            String password = ConfigurationReader.get("hd_password");
            new LoginPage().login(username, password);
            BrowserUtils.waitFor(2);

        } else if (userType.equals("human resource")) {
            String username = ConfigurationReader.get("hr_username");
            String password = ConfigurationReader.get("hr_password");
            new LoginPage().login(username, password);
            BrowserUtils.waitFor(2);

        } else if (userType.equals("marketing")) {
            String username = ConfigurationReader.get("mr_username");
            String password = ConfigurationReader.get("mr_password");
            new LoginPage().login(username, password);
            BrowserUtils.waitFor(2);
        }

    }

    @Then("The user should see {string} title")
    public void the_user_should_see_title(String title) {
        BrowserUtils.waitFor(2);

        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());

        String expectedTitle=title;
        String actualTitle= Driver.get().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }


}
