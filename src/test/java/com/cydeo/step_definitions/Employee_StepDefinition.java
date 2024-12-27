package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Employee_StepDefinition {

    EmployeePage employeePage = new EmployeePage();


    @Then("User click Employees feature")
    public void user_click_employees_feature() {
        employeePage.employeeBnt.click();
    }


    @Then("User click More button")
    public void userClickMoreButton() {
        employeePage.moreBtn.click();
    }


    @Then("user should see below list")
    public void user_should_see_below_list(List<String> expectedEmployeeOptions) {
        List <WebElement> actualEmployeeOptions = employeePage.employeeOptions;
        List <WebElement> actualHiddenElements = employeePage.hiddenElements;
        List <String> actualEmployeeOptionsFull = BrowserUtils.getElementsText(actualEmployeeOptions);
        actualEmployeeOptionsFull.addAll(BrowserUtils.getElementsText(actualHiddenElements));
        actualEmployeeOptionsFull.removeIf(each -> each.isEmpty() || each.isBlank());
        Assert.assertEquals(expectedEmployeeOptions, actualEmployeeOptionsFull);
//        System.out.println(actualEmployeeOptionsFull);
//        System.out.println(employeePage.hiddenSection.getText());
//        System.out.println(employeePage.settingsSection.getText());


    }


    @And("user sees hidden section")
    public void userSeesHiddenSection() {
        Assert.assertTrue(employeePage.hiddenSection.isDisplayed());
    }

    @And("user sees setting section")
    public void userSeesSettingSection() {
        Assert.assertTrue(employeePage.settingsSection.isDisplayed());
    }
}
