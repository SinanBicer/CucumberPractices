package com.CucumberPractices.pages;

import com.CucumberPractices.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ContextMenu extends BasePage {

    public ContextMenu(){
        PageFactory.initElements(Driver.get(),this);
    }



}
