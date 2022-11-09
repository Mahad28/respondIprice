package com.respondIo.stepdef.pages;

import com.respondIo.stepdef.search;
import com.respondIo.stepdef.utility.constants;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.respondIo.stepdef.Base.driver;

public class homePage {

    By searchBarLoc = By.cssSelector("input[role=\"search\"]#term-desktop");
    By searchBtnLoc = By.cssSelector("#search-btn");
    By breadcrumbsLoc = By.cssSelector("#breadcrumbs div div[class=\"di\"] div");

    search s;
    public void navigate(){
        driver.get( constants.BASE_CONFIG.BASE_URL);
    }

    public void searchForItem(String itemName){
        driver.findElement(searchBarLoc).sendKeys(itemName);
        driver.findElement(searchBtnLoc).click();
    }

    public void validateSearchItem(){
        String text = driver.findElement(breadcrumbsLoc).getText();
        System.out.println(text);
        Assert.assertEquals(text,s.searchCriteria);
    }
}
