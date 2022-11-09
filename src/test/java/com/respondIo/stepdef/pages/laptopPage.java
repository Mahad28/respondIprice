package com.respondIo.stepdef.pages;

import com.respondIo.stepdef.utility.constants;
import org.openqa.selenium.By;

import static com.respondIo.stepdef.Base.driver;

public class laptopPage {

    public void navigate(String brandUrl){
        driver.get( constants.BASE_CONFIG.BASE_URL + brandUrl);
    }
    public void clickOnBrand(String brand){
        driver.findElement(By.cssSelector("a[href='https://iprice.my/"+brand+"/computing/laptops/']")).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
