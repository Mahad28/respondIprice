package com.respondIo.stepdef.pages;

import com.respondIo.stepdef.utility.constants;
import org.openqa.selenium.By;

import static com.respondIo.stepdef.Base.driver;

public class dressesPage {
    public int desc;

    By priceLocator = By.cssSelector("a[data-vars-lb=\"Price\"]");
    By descLocator = By.cssSelector("a .i-descending-green");
    public void navigate(String dressPageUrl){
        driver.get( constants.BASE_CONFIG.BASE_URL + dressPageUrl);
    }

    public void sort() throws InterruptedException {
        while(desc<1){
            driver.findElement(priceLocator).click();
            desc = driver.findElements(descLocator).size();
            System.out.println(desc);
        }
        Thread.sleep(3000);
    }

    public void checkDesc(){

    }
}
