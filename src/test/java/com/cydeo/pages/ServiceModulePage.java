package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ServiceModulePage {

    public ServiceModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[11]")
    public WebElement serviceModule;

    @FindBy (xpath = "//div[@class='main-buttons-inner-container']/div/a//span[@class='main-buttons-item-text-title']")
    public List<WebElement> modules;

    @FindBy (xpath = "//div[@class='menu-popup']//a")
    public List<WebElement> moreModules;


    @FindBy (xpath = "//span[.='More']")
    public WebElement moreBtn;


    @FindBy(xpath = "(//span[.='Hidden'])[4]")
    public WebElement hidden;

    @FindBy(xpath = "(//span[.='Settings'])[3]")
    public WebElement settings;



    @FindBy (xpath = "//span[@class='menu-popup-item-text' and (text()='Configure Menu' or text()='Reset menu')]")
    public List<WebElement> actual;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text'])[8]")
    public WebElement faq;

    @FindBy (xpath = "//a[.='Work Process']")
    public WebElement workProcess;


    @FindBy (xpath ="//a[.='Files and Documents']")
    public WebElement filesAndDocuments;


    @FindBy (xpath ="//a[.='Using portal services']")
    public WebElement usingPortalServices;
}
