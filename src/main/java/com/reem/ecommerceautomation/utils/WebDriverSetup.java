package com.reem.ecommerceautomation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSetup {
    private static WebDriver driver;

    //Initializing rhe WebDriver
    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.ebay.com");
        }
        return driver;
    }
    //Tear down the WebDriver Instance
    public static void quitDriver(){
        if(driver!= null){
            driver.quit();
            driver = null;
        }
    }
}
