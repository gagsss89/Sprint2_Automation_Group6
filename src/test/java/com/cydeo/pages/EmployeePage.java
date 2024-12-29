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

    @FindBy(xpath = "//div[@id = 'top_menu_id_company']/div/a//span[@class = 'main-buttons-item-text-title']")
    public List<WebElement> employeeOptions;

    @FindBy(xpath = "(//span[. = 'More'])[2]")
    public WebElement moreBtn;

   @FindBy (xpath ="//div[@class = 'menu-popup-items']//a")
    public List <WebElement> hiddenElements;

   @FindBy(xpath = "(//span[. = 'Hidden'])[4]")
    public WebElement hiddenSection;

   @FindBy(xpath = "(//span[. = 'Settings'])[3]")
    public WebElement settingsSection;

    @FindBy(xpath = "(//span[. = 'Company Structure'])[1]")
    public WebElement companyBtn;

    @FindBy(xpath = "(//span[. = 'Add department'])[1]")
    public WebElement addDepartmentBtn;

    @FindBy(xpath = "//input[@id ='NAME']")
    public WebElement departmentNameInput;

    @FindBy(xpath = "//select[@id = 'IBLOCK_SECTION_ID']/option")
    public List<WebElement> departmentNamesDropdownList;

    @FindBy(xpath = "//select[@id ='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;

    @FindBy (xpath = "//span[.='Add']")
    public WebElement addBtn;

    @FindBy (xpath = "//a[@data-role = 'department_name']")
    public List <WebElement> newDepartmentBox;

}
