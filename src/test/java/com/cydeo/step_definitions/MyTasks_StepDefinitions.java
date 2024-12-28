package com.cydeo.step_definitions;

import com.cydeo.pages.DownloadAppsPage;
import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.MyTaskPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyTasks_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyTaskPage myTaskPage = new MyTaskPage();


    @When("user should see My Task window on the page")
    public void user_should_see_my_task_window_on_the_page() {
        BrowserUtils.verifyElementDisplayed(myTaskPage.myTaskWindow);


    }

    @Then("user should see the Ongoing task summary option")
    public void user_should_see_the_ongoing_task_summary_option() {
        BrowserUtils.verifyElementDisplayed(myTaskPage.ongoingTasks);

    }


    @Then("user should see the number of task")
    public void user_should_see_the_number_of_task() {
        BrowserUtils.verifyElementDisplayed(myTaskPage.ongoingNumberOfTasks);
    }

}
