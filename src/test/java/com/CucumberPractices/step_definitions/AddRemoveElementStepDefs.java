package com.CucumberPractices.step_definitions;


import com.CucumberPractices.pages.AddRemoveElements;
import com.CucumberPractices.utilities.ConfigurationReader;
import com.CucumberPractices.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementStepDefs {

    AddRemoveElements AddRemoveElements = new AddRemoveElements();

    @Given("I opened PracticesCybertek webpage")
    public void i_opened_PracticesCybertek_webpage() {

        Driver.get().get(ConfigurationReader.get("url"));


    }

    @And("I click on Add\\/Remove Elements and open add_remove_elements page")
    public void i_click_on_Add_Remove_Elements_and_open_add_remove_elements_page() {

        AddRemoveElements.AddRemoveElements.click();

        String actualTitle = Driver.get().getCurrentUrl();
        String expectedTitle = "http://practice.cybertekschool.com/add_remove_elements/";
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @Then("I click on Add Element button and Delete button appeared")
    public void i_click_on_Add_Element_button_and_Delete_button_appeared() {

        AddRemoveElements.AddElementButton.click();
        Assert.assertTrue(AddRemoveElements.DeleteElementButton.isDisplayed());

    }

    @And("I click on Delete button and Delete button disappeared")
    public void i_click_on_Delete_button_and_Delete_button_disappeared() {

        AddRemoveElements.DeleteElementButton.click();
        try {
            AddRemoveElements.DeleteElementButton.click();
        }catch (NoSuchElementException e){
            System.out.println("Element successfully disappeared");
        }

    }

}
