package com.cydeo.step_definitions;

import com.cydeo.pages.DownloadAppsPage;
import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.input.BrokenInputStream;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppDownloading_StepDefinitions {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    DownloadAppsPage downloadAppsPage = new DownloadAppsPage();

    @When("user scrolls down and sees the Desktop applications versions")
    public void user_scrolls_down_and_sees_the_desktop_applications_versions() {

        BrowserUtils.scrollToElement(downloadAppsPage.desktopClient);

    }

    @Then("user can see three Desktop applications from below")
    public void user_can_see_three_desktop_applications_from_below(List<String> expectedListOfApps) {

        List<String> actualListOfApps = BrowserUtils.getElementsText(downloadAppsPage.allDesktopApps);
        Assert.assertEquals(expectedListOfApps, actualListOfApps);
        System.out.println("expectedListOfApps = " + expectedListOfApps);
        System.out.println("actualListOfApps = " + actualListOfApps);


    }

    @Then("user can click each option")
    public void user_can_click_each_option() throws InterruptedException {

        downloadAppsPage.macOs.isEnabled();
        downloadAppsPage.macOs.click();
        //BrowserUtils.sleep(2);
        downloadAppsPage.windows.isEnabled();
        downloadAppsPage.windows.click();
        // BrowserUtils.sleep(2);
        downloadAppsPage.linux.isEnabled();
        downloadAppsPage.linux.click();
        // BrowserUtils.sleep(2);
    }

    @When("user scrolls down and sees the Mobile applications versions")
    public void user_scrolls_down_and_sees_the_mobile_applications_versions() {

        BrowserUtils.scrollToElement(downloadAppsPage.mobileApplication);

    }


    @Then("user can see two mobile applications from below")
    public void user_can_see_two_mobile_applications_from_below(List<String> expectedMobileApps) {

        List<String> actualMobileApps = BrowserUtils.getElementsText(downloadAppsPage.allMobileApps);
        Assert.assertEquals(expectedMobileApps, actualMobileApps);
        System.out.println("expectedMobileApps = " + expectedMobileApps);
        System.out.println("actualMobileApps = " + actualMobileApps);

    }


    @Then("user can click on each option")
    public void userCanClickOnEachOption() throws InterruptedException {

        downloadAppsPage.appStore.isEnabled();
        BrowserUtils.waitFor(2);
        downloadAppsPage.appStore.click();
        BrowserUtils.waitFor(2);
        downloadAppsPage.googlePlay.isEnabled();
        BrowserUtils.waitFor(2);
        downloadAppsPage.googlePlay.click();
    }
}