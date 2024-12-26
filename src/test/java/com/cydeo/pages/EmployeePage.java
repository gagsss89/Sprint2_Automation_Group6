package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {

    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title = 'Employees']")
    public WebElement employeeBnt;

    @FindBy(xpath = "(//span[.='Company Structure'])[1] " +
            "| (//span[.='Find Employee'])[1] " +
            "| (//span[. = 'Telephone Directory'])[1]" +
            "| (//span[. = 'Staff Changes'])[1]" +
            "| (//span[. = 'Efficiency Report'])[1]" +
            "| (//span[. = 'Honored Employees'])[1]" +
            "| (//span[. = 'Birthdays'])[1]" +
            "| (//span[. = 'New page'])[1]"
    )
    public List<WebElement> employeeOptions;

    @FindBy(id = "top_menu_id_company_more_button")
    public WebElement moreBtn;

//    @FindBy (xpath = "//a[@class= 'menu-popup-item main-buttons-submenu-item item6']"
//    )
//    public List <WebElement> hiddenElements;



}
