package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MailPage {

    public MailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class = 'menu-item-link-text'])[7]")
    public WebElement mailModule;


    @FindBy(xpath = "//div[. = 'Use and manage your mailbox in Bitrix24']")
    public WebElement bitrix24Message;

    @FindBy(xpath = "//img[@class='mail-add-img']")
    public List<WebElement> mailOperators;

    @FindBy(xpath = "//div[@class = 'mail-msg-sidepanel-title']/span")
    public WebElement mailBoxIntegration;

    @FindBy (xpath = "//span[@title = 'Close']/span")
    public WebElement closeBtn;

    @FindBy(xpath =  "//iframe[@class = 'side-panel-iframe']")
    public WebElement iframe;

    @FindBy(id ="mail_connect_mb_email_field")
    public WebElement emailInputField;

    @FindBy(id ="mail_connect_mb_login_imap_field")
    public WebElement loginInput;

    @FindBy(id ="mail_connect_mb_pass_imap_field")
    public WebElement passwordInput;

    @FindBy(xpath = "(//input[@type ='checkbox'])[2]")
    public WebElement fetchMessageCheckbox;

    @FindBy (id = "mail_connect_save_btn")
    public WebElement connectBtn;

    @FindBy (xpath = "//a[@class = 'mail-add-item'][1]")
    public WebElement gmailBtn;



    public List<String> retrieveListOfEmails(List<WebElement> mailList) {
        List<String> mailListString = new ArrayList<>();
        for (WebElement each : mailList) {
            String altText = each.getDomAttribute("alt");
            if (altText != null) { // Check if altText is not null before using it in the switch statement
                switch (altText.toLowerCase()) {
                    case "gmail": mailListString.add("Gmail"); break;
                    case "outlook.com": mailListString.add("Outlook"); break;
                    case "icloud": mailListString.add("iCloud"); break;
                    case "office365": mailListString.add("Office 365"); break;
                    case "exchange": mailListString.add("Exchange"); break;
                    case "yahoo": mailListString.add("YAHOO!"); break;
                    case "aol": mailListString.add("Aol."); break;
                    case "other": mailListString.add("IMAP"); break;

                }
            }
        }
        return mailListString;
    }


}
