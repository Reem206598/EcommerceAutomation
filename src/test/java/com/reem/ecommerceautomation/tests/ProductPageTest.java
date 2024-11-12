package com.reem.ecommerceautomation.tests;

import com.reem.ecommerceautomation.pages.ProductPage;
import com.reem.ecommerceautomation.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver(); // Initialize WebDriver
        driver.get("https://www.ebay.com/itm/256280150930?_skw=laptop&itmmeta=01JCG3GS4R3AKKDYBG83QCMRTW&hash=item3bab7cc392%3Ag%3AnYIAAOSwKmNmufRh&itmprp=enc%3AAQAJAAAA4HoV3kP08IDx%2BKZ9MfhVJKkQehoOeT9%2BcdRS4pTAOHf4f7dY48BWaL4B3KFe1VyjJX69mUkHRgusE1HSZ1BgG10xU8ncAZ9EnVB6TJKymJ1ZKf1fTVHnygTjdHJnIEwcEOg7JnX7lvoxucZdx8%2F0Bv%2FOkFh3dOUqZxHy4P8%2B670Zu3ln6k%2Fmvf174Km9LZc8%2BaRizFkWilW48Oe9bPGJ3xURYxLLSmNIPnGVDe4FDAAIXsg%2FT87eoZIaQIj0qq%2FXPf%2FUTonA4IzFlMatgbriC3EX2jT3KwnY7cqEknDXUAmd%7Ctkp%3ABFBMvJLDg-Rk&var=556319078129"); // Replace with the actual product page URL
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.quitDriver(); // Clean up WebDriver after each test
    }

    @Test
    public void testAddToCart() {
        ProductPage productPage = new ProductPage(driver);

        // Call the addToCart method
        productPage.addToCart();

        // Verify that the product was added to the cart
        // You can verify by checking if the page redirects to the cart page
        // or if an element (like a confirmation message) appears.

        // Example: Check if redirected to cart page
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "Failed to add product to cart or redirect to cart page.");

        // Alternatively, you can check for a confirmation message
        // Replace with the actual confirmation element locator
        // By confirmationMessage = By.id("confirmationMessage");
        // Assert.assertTrue(driver.findElement(confirmationMessage).isDisplayed(), "Confirmation message not displayed.");
    }
}
