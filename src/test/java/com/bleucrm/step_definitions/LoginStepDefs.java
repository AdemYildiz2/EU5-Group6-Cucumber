package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {

    @Given("The user is logged in as HR")
    public void the_user_is_logged_in_as_HR() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
    }

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String tab) {
        BrowserUtils.waitFor(4);
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToModule(tab);
    }

}
