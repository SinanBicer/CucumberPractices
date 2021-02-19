package com.CucumberPractices.step_definitions;

import com.CucumberPractices.pages.BasicAuth;
import com.CucumberPractices.utilities.BrowserUtils;
import com.CucumberPractices.utilities.ConfigurationReader;
import com.CucumberPractices.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BasicAuthStepDefs {

    BasicAuth basicAuth = new BasicAuth();
    WebDriver driver = Driver.get();


    @Given("I open Practices Cybertek webpage")
    public void i_open_Practices_Cybertek_webpage() {
        driver.get(ConfigurationReader.get("url"));
    }

    @When("I click on BasicAuth section")
    public void i_click_on_BasicAuth_section() {

        basicAuth.BasicAuth.click();
        BrowserUtils.waitFor(3);

    }

    @When("I see the alert popup")
    public void i_see_the_alert_popup() {

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("admin");
        alert.sendKeys("admin");
        alert.accept();

    }

    @Then("I will write my id and password")
    public void i_will_write_my_id_and_password() {

    }

    @Then("I click enter")
    public void i_click_enter() {

    }

}
