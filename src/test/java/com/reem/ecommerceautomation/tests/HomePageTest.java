package com.reem.ecommerceautomation.tests;

import com.reem.ecommerceautomation.pages.HomePage;
import com.reem.ecommerceautomation.utils.WebDriverSetup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    @BeforeMethod
    public void setUp() {
        WebDriverSetup.getDriver();
       // WebDriverSetup.getDriver().get("https://www.amazon.eg/-/en/");
    }

    @AfterMethod
    public void tearDown(){
        WebDriverSetup.quitDriver();
    }

    @Test(invocationCount = 5) // Runs this test 5 times
    public void testSearchProduct() {
        HomePage homePage = new HomePage(WebDriverSetup.getDriver());
        homePage.searchProduct("Laptop");

        // Assertion to verify that the search was successful
        Assert.assertTrue(WebDriverSetup.getDriver().getCurrentUrl().contains("sch"),
        "Search did not navigate to the expected results page");

        // Optional: Go back to the homepage after each search
        // WebDriverSetup.getDriver().get("https://www.amazon.eg/-/en/");

    }
}
