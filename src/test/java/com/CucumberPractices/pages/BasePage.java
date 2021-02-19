package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@href='/add_remove_elements/']")
    public WebElement AddRemoveElements;

    @FindBy(xpath = "//a[@href='/autocomplete']")
    public WebElement AutoComplete;

    @FindBy(xpath = "//a[@href='/basic_auth']")
    public WebElement BasicAuth;

    @FindBy(xpath = "//a[@href='/checkboxes']")
    public WebElement CheckBoxes;

    @FindBy(xpath = "//a[@href='/context_menu']")
    public WebElement ContextMenu;

}
