package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElements extends BasePage{

    public AddRemoveElements(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@onclick=\"addElement()\"]")
    public WebElement AddElementButton;

    @FindBy(xpath = "//button[@onclick=\"deleteElement()\"]")
    public WebElement DeleteElementButton;

}
