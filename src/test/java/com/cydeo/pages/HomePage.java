package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement blogPollButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement blogSubmitButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement blogCancelButton;

    @FindBy(xpath = "(//label[@class='vote-block-close dela'])[3]")
    public WebElement deleteAnswer3;

    @FindBy(id = "question_0")
    public WebElement pollQuestionField;

    @FindBy(id = "answer_0__0_")
    public WebElement pollAnswer1Field;

    @FindBy(id = "answer_0__1_")
    public WebElement pollAnswer2Field;

    @FindBy(id = "answer_0__2_")
    public WebElement pollAnswer3Field;

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement blogMessageButton;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public WebElement messageIframe;

    @FindBy(tagName = "body")
    public WebElement textField;

}
