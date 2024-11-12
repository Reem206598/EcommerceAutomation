package com.reem.ecommerceautomation.tests;

import com.reem.ecommerceautomation.utils.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestSetup {
    @BeforeMethod
    public void setUp(){
        WebDriver driver = WebDriverSetup.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.quitDriver();
    }

    public WebDriver getDriver(){
        return WebDriverSetup.getDriver();
    }

}
