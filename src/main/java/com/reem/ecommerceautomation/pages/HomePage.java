package com.reem.ecommerceautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Locators for elements
    private By searchBox = By.id("gh-ac"); // Search Box locator by id
    private By searchButton = By.id("gh-btn");

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    //Method to search for a product
    public void searchProduct(String productName){
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();

    }
}
