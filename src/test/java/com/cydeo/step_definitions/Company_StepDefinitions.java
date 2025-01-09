package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.BrowserUtils;
import com.github.javafaker.Company;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Company_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CompanyPage CompanyPage = new CompanyPage();


    @When("user should see Company window on the page")
    public void user_should_see_Company_window_on_the_page() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.CompanyWindow);


    }

    @Then("user should see the Company Today Window")
    public void user_should_see_the_Company_Today_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.CompanyToday);

    }


    @Then("user should see the Management Window")
    public void user_should_see_the_Management_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.Management);

    }

    @Then("user should see the Mission and Strategy Window")
    public void user_should_see_the_Mission_Startegy_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.MissionAndStrategy);

    }

    @Then("user should see the History Window")
    public void user_should_see_the_History_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.History);


    }

    @Then("user should see the Corporate Culture Window")
    public void user_should_see_the_Corporate_Culture_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.CorporateCulture);
    }

    @Then("user should see the Management Window")
    public void user_should_see_the_Contacts_Window() {
        BrowserUtils.verifyElementDisplayed(CompanyPage.Contacts);


    }

}