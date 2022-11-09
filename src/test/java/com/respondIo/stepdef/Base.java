package com.respondIo.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;
    @Before
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @After
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
