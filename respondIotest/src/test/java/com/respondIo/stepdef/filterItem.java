package com.respondIo.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;

public class filterItem {
    @Given("^I Navigate to the '/computing/laptops' page$")
    public void iNavigateToTheComputingLaptopsPage() {
        Base.driver.manage().window().maximize();
        Base.driver.get("https://iprice.my/computing/laptops/");
    }
//    @Given("^I Navigate to the '/computing/laptops' page$")
//    public void i_Navigate_to_the_computing_laptops_page() throws Throwable {
//        Base.driver.manage().window().maximize();
//        Base.driver.get("https://iprice.my/computing/laptops/");
//        throw new PendingException();
//    }

    @When("^User Select the brand value to be Dell$")
    public void userSelectTheBrandValueToBeDell() {
        Base.driver.findElement(By.cssSelector("a[href=\"https://iprice.my/dell/computing/laptops/\"]")).click();
    }

    @Then("^Validate that the results returned from page matches the selected brand$")
    public void validateThatTheResultsReturnedFromPageMatchesTheSelectedBrand() throws InterruptedException {
        String title = Base.driver.getTitle();
        assertTrue(title.contains("Dell"));
        Thread.sleep(3000);
    }
}
