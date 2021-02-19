package com.CucumberPractices.step_definitions;

import com.CucumberPractices.pages.AutoComplete;
import com.CucumberPractices.utilities.ConfigurationReader;
import com.CucumberPractices.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class AutoCompleteStepDefs {

    AutoComplete autoComplete = new AutoComplete();
    String countrySelected;

    @Given("I open PracticesCybertek webpage")
    public void i_open_PracticesCybertek_webpage() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("I click on Autocomplete section")
    public void i_click_on_Autocomplete_section() {

        autoComplete.AutoComplete.click();

    }

    @When("I click on TextForm and write {string} letter")
    public void i_click_on_TextForm_and_write_a_letter(String string) {

        autoComplete.CountryTextForm.sendKeys(string);


    }

    @When("Autocomplete DropDown appeared and I click on {string}")
    public void autocomplete_DropDown_appeared_and_I_click_on_a_country(String string) {

        for (int i = 0; i < autoComplete.countriesNoSelectDropDown.size(); i++) {
            System.out.println(autoComplete.countriesNoSelectDropDown.get(i).getText());
            if (autoComplete.countriesNoSelectDropDown.get(i).getText().equals(string)){
                autoComplete.countriesNoSelectDropDown.get(i).click();
                countrySelected = string;
            }
        }

    }

    @When("I click on Submit Button")
    public void i_click_on_Submit_Button() {

        autoComplete.submitButton.click();

    }

    @Then("I should see my selected country on the page")
    public void i_should_see_my_selected_country_on_the_page() {

        Assert.assertTrue(autoComplete.result.getText().contains(countrySelected));

    }

}
