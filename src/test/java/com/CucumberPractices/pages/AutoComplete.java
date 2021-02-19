package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutoComplete extends BasePage{

    public AutoComplete(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "myCountry")
    public WebElement CountryTextForm;

    @FindBy(xpath = "//input[@type=\"button\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"myCountryautocomplete-list\"]//div")
    public List<WebElement> countriesNoSelectDropDown;

    @FindBy(id = "result")
    public WebElement result;

}
