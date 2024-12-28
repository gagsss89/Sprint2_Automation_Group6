package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage {

    public MyTaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='My Tasks']")
    public WebElement myTaskWindow;

    @FindBy(xpath = "(//span[@class='task-item-text'][1])")
    public WebElement ongoingTasks;

    @FindBy(xpath = "(//span[@class='task-item-index'][1])")
    public WebElement ongoingNumberOfTasks;


}
