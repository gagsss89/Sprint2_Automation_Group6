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
    //private static WebDriver driver;

    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();

    //create reusable method which will return the same driver instance once we call it
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            //we will read our browserType from configuration.properties file
            String browserType = ConfigurationReader.getProperty("browser");


            //depending on the browserType return from the congiguration.properties
            // switch statement will determine the case and open the matching browser
            switch ((browserType)) {
                case "chrome":

                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case"firefox":

                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;


            }
        }
        return driverPool.get();
    }

    //Create a new Driver.closedriver(); it will use .quit() to quit browser

    public static void closeDriver() {

        if( driverPool.get() != null) {

            driverPool.get().quit();

            driverPool.remove();
        }
    }
}
