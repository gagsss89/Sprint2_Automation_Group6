package com.cydeo.step_definitions;

import com.cydeo.pages.MailPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.output.BrokenWriter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Mail_StepDefinition {

    MailPage mailPage = new MailPage();

    @Then("user clicks Mail module")
    public void user_clicks_mail_module() {
        mailPage.mailModule.click();
    }

    @Then("user verifies Bitrix24” is displayed")
    public void user_verifies_bitrix24_is_displayed() {
        Assert.assertTrue(mailPage.bitrix24Message.isDisplayed());
    }

    @Then("user verifies mail operators are displayed in the following order")
    public void userVerifiesMailOperatorsAreDisplayedInTheFollowingOrder(List<String> expectedOperators) {
        List<WebElement> actualMailOperatorElements = mailPage.mailOperators;
        List<String> actualMailOperator = mailPage.retrieveListOfEmails(actualMailOperatorElements);
        Assert.assertEquals(expectedOperators, actualMailOperator);
    }


    @And("user verifies each email operator is clickable and {string} is displayed")
    public void userVerifiesEachEmailOperatorIsClickableAndIsDisplayed(String verificationText) {

        List<WebElement> actualMailOperators = mailPage.mailOperators;
        for (WebElement each : actualMailOperators) {
            each.click();
            BrowserUtils.waitFor(2);
            Driver.getDriver().switchTo().frame(mailPage.iframe);
            Assert.assertTrue(mailPage.mailBoxIntegration.isDisplayed());
            BrowserUtils.waitFor(1);
            Driver.getDriver().switchTo().parentFrame();
            mailPage.closeBtn.click();
            BrowserUtils.waitFor(2);

        }

    }


//    @When("user is able to write his {string} and {string} fields")
//    public void userIsAbleToWriteHisAndFields(String email, String password) {
//
//        List <WebElement> actualMailOperators = mailPage.mailOperators;
//        for (WebElement each : actualMailOperators) {
//            each.click();
//            BrowserUtils.waitFor(2);
//            Driver.getDriver().switchTo().frame(mailPage.iframe);
//            mailPage.emailInputField.sendKeys(email);
//            mailPage.passwordInput.sendKeys(password);
//
//            Assert.assertEquals(mailPage.emailInputField.getDomAttribute("value"), mailPage.loginInput.getDomAttribute("value"));
//            Assert.assertTrue(mailPage.fetchMessageCheckbox.isSelected());
//
//            BrowserUtils.waitFor(1);
//            mailPage.connectBtn.click();
//            Driver.getDriver().switchTo().parentFrame();
//            mailPage.closeBtn.click();
//            BrowserUtils.waitFor(2);
//
//        }
//
//
//    }

    @And("user verifies E-mail and Login field has the same emails")
    public void userVerifiesEMailAndLoginFieldHasTheSameEmails() {
        BrowserUtils.waitFor(2);
        String emailInput = mailPage.emailInputField.getDomAttribute("value");
        String loginInput = mailPage.loginInput.getDomAttribute("value");
        Assert.assertEquals(emailInput, loginInput);

    }

    @Then("user verifies that fetch checkbox is selected")
    public void userVerifiesThatFetchCheckboxIsSelected() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(mailPage.fetchMessageCheckbox.isSelected());
    }

    @And("user clicks connect button")
    public void userClicksConnectButton() {
        BrowserUtils.waitFor(2);
        mailPage.connectBtn.click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().switchTo().parentFrame();
    }


    @When("user is able to write his {string} and {string} fields")
    public void userIsAbleToWriteHisAndFields(String userName, String password) {
        Driver.getDriver().switchTo().frame(mailPage.iframe);
        mailPage.emailInputField.sendKeys(userName);
        mailPage.passwordInput.sendKeys(password);

    }

    @And("user clicks gmailOperator")
    public void userClicksGmailOperator() {
        mailPage.gmailBtn.click();
    }

//    @And("user verifies {string} message is displayed")
//    public void userVerifiesMessageIsDisplayed(String message) {
//
//    }
}
