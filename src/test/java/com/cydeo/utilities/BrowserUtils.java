package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class BrowserUtils {

    public static void sleep(int second) throws InterruptedException {

        /*
        This method will exept int (in seconds)
        and execute Thread.sleep method for given duration
         */
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e) {

        }

    }

    public static void switchWindowAndVerify(String expectedInURL, String expectedInTitle) {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for(String each : allWindowHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }


        //5. Assert: Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    public static void verifyTitleContains(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    public static void waitForInvisibilityOf(WebElement target) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static void waitForTitleContains(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static void waitForTitle(String title, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleIs(title));
    }

    //this method accepts a dropdown element and returns a List<String> that contains all options values as String
    public static List<String> dropdownOptions_as_String(WebElement dropdownElement) {

        Select month = new Select(dropdownElement);
        //storing all of the options into a List of WebElements
        List<WebElement> actualMonth_as_WebElement = month.getOptions();
        //creating an empty list of String to store actual <option> as String
        List<String > actualMonth_as_Sting = new ArrayList<>();
        //looping throug the List<WebElement> , getting all options texts, and storing them into List<String>
        for (WebElement each : actualMonth_as_WebElement) {
            actualMonth_as_Sting.add(each.getText());
        }
        return actualMonth_as_Sting;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equals(attributeValue)) {
                each.click();
            }
        }
    }


}
