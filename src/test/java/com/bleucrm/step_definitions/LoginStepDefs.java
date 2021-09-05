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

    //valid credentials
    @When("The user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {

        String username=null;
        String password=null;

        if (userType.equals("help desk")) {
            username = ConfigurationReader.get("hd_username");
            password = ConfigurationReader.get("hd_password");
            BrowserUtils.waitFor(2);

        } else if (userType.equals("human resource")) {
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("hr_password");
            BrowserUtils.waitFor(2);

        } else if (userType.equals("marketing")) {
            username = ConfigurationReader.get("mr_username");
            password = ConfigurationReader.get("mr_password");
            BrowserUtils.waitFor(2);
        }
        new LoginPage().login(username,password);
    }

    @Then("The user should see {string} title")
    public void the_user_should_see_title(String title) {
        BrowserUtils.waitFor(2);

        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());

        String actualTitle= Driver.get().getTitle();

        Assert.assertTrue(actualTitle.contains(title));

    }
    //invalid and blank credentials
    @When("The user is logged in as {string} credentials")
    public void the_user_is_logged_in_as_credential(String fakeU) {

        String username=null;
        String password=null;

        if (fakeU.equals("fake1")) {
            username = "marketin@school.com";
            password = "UserUser";                           //Correct password
            BrowserUtils.waitFor(2);

        } else if (fakeU.equals("fake2")) {
            username = "adem@cbertek";
            password = "useruser";
            BrowserUtils.waitFor(2);

        } else if (fakeU.equals("help desk")) {
            username = ConfigurationReader.get("hd_username");  //correct username
            password = "user";
            BrowserUtils.waitFor(2);

        }else if (fakeU.equals("blank")) {
            username = "";
            password = "";
            BrowserUtils.waitFor(2);
        }
        new LoginPage().login(username,password);
    }

    @Then("the user should see errorText")
    public void the_user_should_see_errorText() {

        System.out.println(new LoginPage().IncorrectInput.getText());

        Assert.assertEquals("Incorrect login or password",new LoginPage().IncorrectInput.getText());


    }
}
