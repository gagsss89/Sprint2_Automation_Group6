package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to access to this object
    private Driver() {
    }

    //we make constructor private because we want to close access from outside classes
    //we make static because we will use it in a static method
    private static WebDriver driver;

    //create reusable method which will return the same driver instance once we call it
    public static WebDriver getDriver() {

        if (driver == null) {
            //we will read our browserType from configuration.properties file
            String browserType = ConfigurationReader.getProperty("browser");


            //depending on the browserType return from the congiguration.properties
            // switch statement will determine the case and open the matching browser
            switch ((browserType)) {
                case "chrome":

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case"firefox":

                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;


            }
        }
        return driver;
    }

    //Create a new Driver.closedriver(); it will use .quit() to quit browser

    public static void closeDriver() {

        if( driver != null) {

            driver.quit();

            driver = null;
        }
    }
}
