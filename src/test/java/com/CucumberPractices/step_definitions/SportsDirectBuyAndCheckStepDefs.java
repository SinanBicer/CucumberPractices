package com.CucumberPractices.step_definitions;

import com.CucumberPractices.utilities.BrowserUtils;
import com.CucumberPractices.utilities.ConfigurationReader;
import com.CucumberPractices.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class SportsDirectBuyAndCheckStepDefs {

    WebDriver driver = Driver.get();
    WebElement webElement;
    String nameOfTheItem;
    String colourName;
    String productName;

    @Given("I open the SPORTSDIRECT webpage")
    public void i_open_the_SPORTSDIRECT_webpage() {


        driver.get("https://www.sportsdirect.com/");


    }

    @When("I search for a t-shirt")
    public void i_search_for_a_t_shirt() {

       webElement = driver.findElement(By.id("txtSearch"));
       webElement.sendKeys("t-shirt");
       webElement.sendKeys(Keys.ENTER);

    }

    @When("I click on a t-shirt")
    public void i_click_on_a_t_shirt() {

        webElement = driver.findElement(By.xpath("//*[@id=\"navlist\"]/li[1]"));
        webElement.click();

        webElement = driver.findElement(By.xpath("//*[@data-text=\"10 (S)\"]"));
        webElement.click();

        webElement = driver.findElement(By.id("lblProductBrand"));
        nameOfTheItem = webElement.getText();

        webElement = driver.findElement(By.id("lblProductName"));
        nameOfTheItem = nameOfTheItem+ " " + webElement.getText();

        webElement = driver.findElement(By.id("colourName"));
        colourName = webElement.getText();

        webElement = driver.findElement(By.id("aAddToBag"));
        webElement.click();

        BrowserUtils.waitFor(3);


    }

    @Then("I should see the t-shirt added to basket\\/bag")
    public void i_should_see_the_t_shirt_added_to_basket_bag() {

        webElement = driver.findElement(By.id("aBagLink"));
        webElement.click();

        webElement = driver.findElement(By.id("dhypProductLink"));
        productName = webElement.getText();

        webElement = driver.findElement(By.xpath("//*[@class=\"productcolour\"]/span[2]"));
        String actualColour = webElement.getText();

        webElement = driver.findElement(By.id("divContinueSecurely"));

        Assert.assertEquals(productName.toLowerCase(),nameOfTheItem.toLowerCase());
        Assert.assertEquals(colourName,actualColour);


    }
}
