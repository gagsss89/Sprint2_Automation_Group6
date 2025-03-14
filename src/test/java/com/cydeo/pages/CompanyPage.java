package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {


    public By CompanyWindow;

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='company-information']")
    public WebElement CompanyToday;

    @FindBy(xpath = "//span[@class='company-lead']")
    public WebElement Management;

    @FindBy(xpath = "//span[@class='company-goals']")
    public WebElement MissionAndStrategy;

    @FindBy(xpath = "//span[@class='company-history']")
    public WebElement History;

    @FindBy(xpath = "//span[@class='company-traditions']")
    public WebElement CorporateCulture;

    @FindBy(xpath = "//span[@class='company-Emails-Phone']")
    public WebElement Contacts;


    public WebElement getManagement() {
        return Management;
    }

    public void setManagement(WebElement management) {
        Management = management;
    }
}
