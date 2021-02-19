package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox extends BasePage{

    public CheckBox(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkbox2;

}
