package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is in login page")
    public void user_is_in_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("envURL"));
    }
    @When("User enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User lands on home page")
    public void user_lands_on_home_page() {
        String expectedUrl = "https://qa.symmetrix.io/stream/?login=yes";
        Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());

    }

}