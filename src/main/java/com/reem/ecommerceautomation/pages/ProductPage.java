package com.reem.ecommerceautomation.pages;

import net.bytebuddy.implementation.bind.annotation.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By addToCartButton = By.id("atcBtn_btn_1");

    //Constructor
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    //Method to add the product to the cart
    public void addToCart(){
        driver.findElement(addToCartButton).click();

    }
}
