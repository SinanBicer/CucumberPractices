package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasicAuth extends BasePage{

    public BasicAuth(){
        PageFactory.initElements(Driver.get(),this);
    }

}
