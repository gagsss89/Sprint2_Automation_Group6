package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DownloadAppsPage {

    public DownloadAppsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Desktop client']")
    public WebElement desktopClient;

    @FindBy(xpath = "//div[@class='b24-app-block b24-app-desktop']//a")
    public List<WebElement> allDesktopApps;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[2]")
    public WebElement macOs;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[4]")
    public WebElement windows;

    @FindBy(xpath = "(//div[@class='b24-app-block-content']/a/span)[6]")
    public WebElement linux;


}
