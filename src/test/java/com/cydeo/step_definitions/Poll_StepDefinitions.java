package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Poll_StepDefinitions {
    Faker faker = new Faker();
    String testWord = faker.bothify("Random-question-####?");

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is already logged in on website")
    public void user_is_already_logged_in_on_website() {
        loginPage.login();
    }

    @When("user click on the POLL feature")
    public void user_click_on_the_poll_feature() {
        homePage.blogPollButton.click();
    }

    @When("user add message")
    public void user_add_message() {
        Driver.getDriver().switchTo().frame(homePage.messageIframe);
        homePage.textField.sendKeys("Test message");
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user enter poll question and two answers")
    public void user_enter_poll_question_and_two_answers() {
        homePage.pollQuestionField.sendKeys(testWord);
        homePage.pollAnswer1Field.sendKeys("YES");
        homePage.pollAnswer2Field.sendKeys("NO");
    }

    @When("click send button")
    public void click_send_button() {
        homePage.blogSubmitButton.click();
    }

    @Then("created poll should be displayed in the field")
    public void created_poll_should_be_displayed_in_the_field() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='"+testWord+"']")).isDisplayed());
    }

    @When("user click cancel button")
    public void user_click_cancel_button() {
        homePage.blogCancelButton.click();
    }

    @Then("poll creation will be canceled , user returned to message option")
    public void poll_creation_will_be_canceled_user_returned_to_message_option() {
        String activeFeature = Driver.getDriver().findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).getText();
        Assert.assertEquals(homePage.blogMessageButton.getText(),activeFeature);

    }

    @And("user remove third answer option")
    public void userRemoveThirdAnswerOption() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.pollAnswer3Field).perform();
        homePage.deleteAnswer3.click();
    }
}
