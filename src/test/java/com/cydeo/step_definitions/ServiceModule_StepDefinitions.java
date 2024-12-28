package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.ServiceModulePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;

import java.util.List;

public class ServiceModule_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ServiceModulePage serviceModulePage = new ServiceModulePage();


    @Given("user is on the Symmetrix home page")
    public void user_is_on_the_symmetrix_home_page() {
        loginPage.login();


    }

    @When("user navigates to the Service module")
    public void user_navigates_to_the_service_module() {
        serviceModulePage.serviceModule.click();
    }

    @When("user sees different modules in specific order")
    public void user_sees_different_modules_in_specific_order(List<String> expectedModules) {


        serviceModulePage.moreBtn.click();
        //add all modules to the WebElements list
        List<WebElement> actualModules = serviceModulePage.modules;
        //convert actualModulesText to the list of String
        List<String> actualModulesText = BrowserUtils.getElementsText(actualModules);
        //convert additionalModules to the list of String
        List<String> additionalModules = BrowserUtils.getElementsText(serviceModulePage.moreModules);
        //add additionalModules to the actualModulesText
        actualModulesText.addAll(additionalModules);
        //remove empty and blank elements from the list
        actualModulesText.removeIf(each -> each.isEmpty() || each.isBlank());

        Assert.assertEquals(expectedModules, actualModulesText);

    }

    @Then("user clicks More button")
    public void userClicksMoreButton() {
        serviceModulePage.moreBtn.click();
    }

    @When("user sees Hidden section")
    public void user_sees_hidden_section() {
        Assert.assertTrue(serviceModulePage.hidden.isDisplayed());

    }

    @When("user sees Setting section with different options")
    public void user_sees_setting_section_with_different_options(List<String> expected) {
        System.out.println(expected);
        Assert.assertTrue(serviceModulePage.settings.isDisplayed());
        List<WebElement> actualM = serviceModulePage.actual;
        List<String> actualMText = BrowserUtils.getElementsText(actualM);

        Assert.assertEquals(expected,actualMText);


    }

    @When("user clicks FAQ is able to see documents")
    public void userClicksFAQIsAbleToSeeDocuments() {
        serviceModulePage.faq.click();
    }

    @Then("is able to access {string}")
    public void isAbleToAccess(String option) throws InterruptedException {

        serviceModulePage.workProcess.isDisplayed();
        BrowserUtils.waitFor(2);
        serviceModulePage.workProcess.click();
        serviceModulePage.filesAndDocuments.isDisplayed();
        BrowserUtils.waitFor(2);
        serviceModulePage.filesAndDocuments.click();
        serviceModulePage.usingPortalServices.isDisplayed();
        serviceModulePage.usingPortalServices.click();


    }

    @And("user is able to access  any question")
    public void userIsAbleToAccessAnyQuestion() {

        serviceModulePage.workProcess.click();
        serviceModulePage.click(serviceModulePage.questions);
    }

    @And("user is able to see the answer")
    public void userIsAbleToSeeTheAnswer() {
    List<WebElement> answerText = serviceModulePage.answers;
        for (WebElement each : answerText) {
            Assert.assertTrue(each.isDisplayed());

        }

    }

    @And("user is able to click like button")
    public void userIsAbleToClickLikeButton() {
        BrowserUtils.waitFor(3);
        serviceModulePage.click(serviceModulePage.likeButton);

    }
}
