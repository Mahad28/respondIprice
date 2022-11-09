package com.respondIo.stepdef;

import com.respondIo.stepdef.pages.laptopPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.respondIo.stepdef.Base.driver;
import static junit.framework.TestCase.assertTrue;

public class filterItem {
    laptopPage lp = new laptopPage();

    @Given("^I Navigate to the \"([^\"]*)\" page$")
    public void iNavigateToTheComputingLaptopsPage(String brandUrl) {
        driver.manage().window().maximize();
        lp.navigate(brandUrl);
    }

    @When("^User Select the brand value to be \"([^\"]*)\"$")
    public void userSelectTheBrandValueToBeDell(String brand) {
        lp.clickOnBrand(brand);
    }

    @Then("^Validate that the results returned from page matches the brand \"([^\"]*)\"$")
    public void validateThatTheResultsReturnedFromPageMatchesTheSelectedBrand(String brandName) throws InterruptedException {
        String title = lp.getTitle();
        String url = lp.getUrl();
        assertTrue(title.contains(brandName));
        assertTrue(url.contains(brandName.toLowerCase()));
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
    }
}
