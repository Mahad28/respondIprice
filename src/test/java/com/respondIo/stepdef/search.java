package com.respondIo.stepdef;

import com.respondIo.stepdef.pages.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.respondIo.stepdef.Base.driver;

public class search {

    homePage hp = new homePage();
    public String searchCriteria;

    @Given("^User should navigate to the homepage$")
    public void userShouldNavigateToTheHomepage() {
        driver.manage().window().maximize();
        hp.navigate();
    }

    @When("^Search for \"([^\"]*)\"$")
    public void searchForIPhone(String searchItem) throws InterruptedException {
        this.searchCriteria=searchItem;
        hp.searchForItem(searchItem);

        Thread.sleep(2000);
    }

    @Then("^Validate that the search results returned matches the search criteria$")
    public void validateThatTheSearchResultsReturnedMatchesTheSearchCriteria() {
        hp.validateSearchItem();
    }
}
