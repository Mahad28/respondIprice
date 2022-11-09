package com.respondIo.stepdef;

import com.respondIo.stepdef.pages.dressesPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.respondIo.stepdef.Base.driver;

public class sort {
    public static int t;
    dressesPage dp = new dressesPage();
    @Given("^Navigate to the \"([^\"]*)\" page$")
    public void navigateToThePage(String dressPageUrl){
        driver.manage().window().maximize();
        dp.navigate(dressPageUrl);
    }

    @When("^Click on Price sorting until the indicator indicates that the list is sorted by price in descending order$")
    public void clickOnPriceSortingUntilTheIndicatorIndicatesThatTheListIsSortedByPriceInDescendingOrder() throws InterruptedException {
        dp.sort();
    }

    @Then("^Validate that the results are sorted in descending order of Price$")
    public void validateThatTheResultsAreSortedInDescendingOrderOfPrice() {
        driver.findElement(By.cssSelector("a .i-descending-green")).isDisplayed();
        List<WebElement> price = driver.findElements(By.cssSelector("a[data-vars-action=\"shop\"] div div.ellipsis-1"));
        List<String> afterSplitPrice = new ArrayList<>();

        for (WebElement p: price)
        {
            afterSplitPrice.add(p.getText().replace("RM ",""));
        }
        //System.out.println(afterSplitPrice);
        String[] a = new String[afterSplitPrice.size()];
        for(int j =0;j<afterSplitPrice.size();j++){
            a[j] = afterSplitPrice.get(j);
        }
        for(String k: a)
        {
            System.out.println(k);
        }
    }
}
