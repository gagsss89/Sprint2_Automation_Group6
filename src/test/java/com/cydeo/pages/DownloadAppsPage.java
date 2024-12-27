package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DownloadAppsPage {

    public DownloadAppsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Desktop client']")
    public WebElement desktopClient;

    @FindBy(xpath = "//div[@class='b24-app-block b24-app-desktop']//a")//b24-app-block-content
    public List<WebElement> allDesktopApps;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[2]")
    public WebElement macOs;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[4]")
    public WebElement windows;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[6]")
    public WebElement linux;

    @FindBy(xpath = "//div[.='Mobile application']")
    public WebElement mobileApplication;

    @FindBy(xpath = "//div[@class='b24-app-block-content']/a[@href='https://itunes.apple.com/app/bitrix24/id561683423' or @href='https://play.google.com/store/apps/details?id=com.bitrix24.android']\n")
    public List<WebElement> allMobileApps;

    @FindBy(xpath = "//span[@class='b24-app-icon b24-app-icon-ios']")
    public WebElement appStore;

    @FindBy(xpath = "//span[@class='b24-app-icon b24-app-icon-android']")
    public WebElement googlePlay;

}
