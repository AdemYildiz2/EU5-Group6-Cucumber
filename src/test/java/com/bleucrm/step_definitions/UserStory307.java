package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStory307 {

    @Given("User should be able to make comment")
    public void user_should_be_able_to_make_comment() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.addComment.click();
        activityStreamPage.switchToIframe("Hello World!");
        Driver.get().switchTo().parentFrame();
        activityStreamPage.textBoxSend.click();
        BrowserUtils.waitFor(3);
    }


    @When("User should be able to like")
    public void user_should_be_able_to_like() {

    }
    @Then("User should be able to unfollow other users")
    public void user_should_be_able_to_unfollow_other_users() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
