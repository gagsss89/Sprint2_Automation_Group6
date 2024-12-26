package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Employee_StepDefinition {

    EmployeePage employeePage = new EmployeePage();


    @Then("User click Employees feature")
    public void user_click_employees_feature() {
        employeePage.employeeBnt.click();
    }

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> expectedEmployeeOptions) {
        List <WebElement> actualEmployeeOptions = employeePage.employeeOptions;
        System.out.println(BrowserUtils.getElementsText(actualEmployeeOptions));
        System.out.println(actualEmployeeOptions.size());
        //System.out.println(BrowserUtils.getElementsText(employeePage.hiddenElements));

        //Assert.assertEquals(expectedEmployeeOptions, BrowserUtils.getElementsText(actualEmployeeOptions));

    }


}
