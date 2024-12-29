package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    }


    @And("user sees hidden section")
    public void userSeesHiddenSection() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(employeePage.hiddenSection.isDisplayed());
    }

    @And("user sees setting section")
    public void userSeesSettingSection() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(employeePage.settingsSection.isDisplayed());
    }


    @Then("the user is on the Company Structure page")
    public void theUserIsOnTheCompanyStructurePage() {
        employeePage.companyBtn.click();
    }



    @When("the user clicks the New Department button")
    public void theUserClicksTheNewDepartmentButton() {
        BrowserUtils.waitFor(2);
        employeePage.addDepartmentBtn.click();
    }


    @When("the user enters a {string} in the input field")
    public void theUserEntersAInTheInputField(String newDepartmentName) {
        employeePage.departmentNameInput.clear();
        employeePage.departmentNameInput.sendKeys(newDepartmentName);
    }

    @And("the user selects a {string} from the dropdown list")
    public void theUserSelectsAFromTheDropdownList(String parentDepartment) {
        Select select = new Select(employeePage.parentDepartmentDropdown);
        select.selectByValue("138");
        BrowserUtils.waitFor(3);
    }


    @And("the newly created department is displayed in the company structure")
    public void theNewlyCreatedDepartmentIsDisplayedInTheCompanyStructure() {
        for (WebElement each : employeePage.newDepartmentBox) {
           if (each.getText().equals(ConfigurationReader.getProperty("DepartmentName"))){
               Assert.assertTrue(each.isDisplayed());
           }
        }
    }

    @When("the user clicks the Add button")
    public void theUserClicksTheAddButton() {
        employeePage.addBtn.click();
    }

}
