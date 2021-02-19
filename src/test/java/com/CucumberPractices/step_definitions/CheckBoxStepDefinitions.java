package com.CucumberPractices.step_definitions;

import com.CucumberPractices.pages.CheckBox;
import com.CucumberPractices.utilities.ConfigurationReader;
import com.CucumberPractices.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CheckBoxStepDefinitions {

    CheckBox checkBox = new CheckBox();

    @Given("I open Practices Cybertek webpage and I click on CheckBox section")
    public void i_open_Practices_Cybertek_webpage_and_I_click_on_CheckBox_section() {

        Driver.get().get(ConfigurationReader.get("url"));
        checkBox.CheckBoxes.click();
    }

    @When("I click on Checkbox{int} and Checkbox{int}")
    public void i_click_on_Checkbox_and_Checkbox(Integer int1, Integer int2) {
        Assert.assertFalse(checkBox.checkbox1.isSelected());
        checkBox.checkbox1.click();

        Assert.assertTrue(checkBox.checkbox2.isSelected());
        checkBox.checkbox2.click();

    }

    @Then("Checkbox {int} must be unchecked")
    public void checkbox_must_be_unchecked(Integer int1) {
        Assert.assertTrue(checkBox.checkbox1.isSelected());
    }

    @Then("Checkbox {int} must be checked")
    public void checkbox_must_be_checked(Integer int1) {
        Assert.assertFalse(checkBox.checkbox2.isSelected());
    }

}
