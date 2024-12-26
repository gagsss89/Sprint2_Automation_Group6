package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "pre" and "post" condition for ALL the SCENARIOS and even STEPS
 */
public class Hooks {
    @Before
    public void setupMethod(){
        System.out.println("----> @Before: RUNNING BEFORE EACH SCENARIO");
    }
    //@Before ("student")
    public void login_scenario_before(){
        System.out.println("----> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void teardownMethod(Scenario scenario){
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }



        System.out.println("----> @After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }
    //    @BeforeStep
    public void setupStep(){
        System.out.println("-----> @BeforeSTEP: RUNNING BEFORE EACH STEP");
    }
    //    @AfterStep
    public void teardownStep(){
        System.out.println("-------> @AfterSTEP: RUNNING AFTER EACH STEP");
    }
}
