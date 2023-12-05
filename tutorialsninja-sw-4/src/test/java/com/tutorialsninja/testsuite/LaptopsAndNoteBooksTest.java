package com.tutorialsninja.testsuite;

import com.tutorialsninja.basetest.BaseTest;
import com.tutorialsninja.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNoteBooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopAndBooksPage laptopAndBooksPage = new LaptopAndBooksPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNotebook();

        //1.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // * 1.3	Select Sort By "Price (High > Low)"
        laptopAndBooksPage.selectSortByPriceHighToLow("Price (High > Low)");

        // * 1.4	Verify the Product price will arrange in High to Low order.
        String actualPrice = laptopAndBooksPage.verifyProductPriceArrangeInHighToLow();
        String expectedPrice = "$2,000.00";
        String expectedMessage = expectedPrice + "\n" +
                "Ex Tax:" + expectedPrice;
        Assert.assertEquals(actualPrice, expectedMessage, "Incorrect price  order!");
    }


    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        // Mouse hover on Currency Dropdown and click
        Thread.sleep(1000);
        homePage.mouseHoverOnCurrencyDropdownAndClick();

        // Mouse hover on £Pound Sterling and click
        Thread.sleep(1000);
        homePage.mouseHoverOnPoundAndClick();

        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNotebook();

        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");

        Thread.sleep(1000);
        //2.3 Select Sort By "Price (High > Low)"
        laptopAndBooksPage.sortByPrice("Price (High > Low)");

        //2.4 Select Product “MacBook”
        laptopAndBooksPage.selectMacBookProduct();

        // * 2.5	Verify the text “MacBook”
        String actualText = macBookPage.verifyTheTextMacBook();
        String expectedText = "MacBook";
        Assert.assertEquals(actualText, expectedText, "Incorrect Product Text displayed!");

        // * 2.6	Click on ‘Add To Cart’ button
        macBookPage.clickOnAddToCart();

        // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
        String actualSuccessMessage = macBookPage.verifySuccessMessageForAddingProductToShoppingCart();
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!\n×";
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Invalid Success Message!");

        // * 2.8	Click on link “shopping cart” display into success message
        macBookPage.clickOnLinkToShoppingCartMessage();

        // * 2.9	Verify the text "Shopping Cart"
        Thread.sleep(2000);
        String actualCartText = shoppingCartPage.verifyShoppingCartText();
        String expectedCartText = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualCartText, expectedCartText, "Incorrect Shopping Cart Message displayed!");

        // * 2.10	Verify the Product name "MacBook"
        String actualProductName = shoppingCartPage.verifyProductNameIsMacBook();
        String expectedProductName = "MacBook";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect product Name displayed!");

        // * 2.11	Change Quantity "2"
        Thread.sleep(2000);
        shoppingCartPage.clearTheQtyBox();
        Thread.sleep(2000);
        shoppingCartPage.enterQuantityIntoTheBox("2");

        // * 2.12	Click on “Update” Tab
        shoppingCartPage.clickOnUpdateTheQuantityBox();
        Thread.sleep(2000);
        // * 2.13	Verify the message “Success: You have modified your shopping cart!”
        String actualUpdatedMessage = shoppingCartPage.verifyUpdatedSuccessMessage();
        String expectedUpdatedMessage = "Success: You have modified your shopping cart!\n×";
        Assert.assertEquals(actualUpdatedMessage, expectedUpdatedMessage, "Incorrect updated message displayed!");

        // * 2.14	Verify the Total £737.45
        Thread.sleep(2000);
        String actualTotalPrice = shoppingCartPage.verifyTotalPrice();
        String expectedTotalPrice = "£737.45";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect total price displayed!");

        // * 2.15	Click on “Checkout” button
        Thread.sleep(2000);
        shoppingCartPage.clickOnCheckOutButton();

        // * 2.16	Verify the text “Checkout”
        Thread.sleep(2000);
        String actualCheckOutText = checkOutPage.verifyCheckOutText();
        String expectedCheckOutText = "Checkout";
        Assert.assertEquals(actualCheckOutText, expectedCheckOutText, "Incorrect checkout text displayed!");


        // * 2.17	Verify the Text “New Customer”
        Thread.sleep(2000);
        String actualNewCustomerText = checkOutPage.verifyTextNewCustomer();
        String expectedNewCustomerText = "New Customer";
        Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText, "Incorrect new customer text displayed!");
        // * 2.18	Click on “Guest Checkout” radio button
        checkOutPage.clickOnGuestCheckOutButton();

        // * 2.19	Click on “Continue” tab
        checkOutPage.clickOnContinueButtonTab();

        // * 2.20	Fill the mandatory fields
        checkOutPage.enterFirstName("Michel");
        checkOutPage.enterLastName("Jackson");
        checkOutPage.enterEmail("mkjk@gmail.com");
        checkOutPage.enterTelephone("0987654321");
        checkOutPage.enterAddress("Bhavnath");
        checkOutPage.enterCity("Junagadh");
        checkOutPage.enterPostcode("3456789");
        checkOutPage.enterCountry("India");
        checkOutPage.enterZone("Gujarat");


        // * 2.21	Click on “Continue” Button
        checkOutPage.clickOnContinueButtonForGuest();

        // * 2.22	Add Comments About your order into text area
        checkOutPage.addCommentsAboutYourOrderIntoTheTextArea("Leave it by door please");

        // * 2.23	Check the Terms & Conditions check box
        checkOutPage.clickOnCheckBoxForTermsAndConditions();

        // * 2.24	Click on “Continue” button
        checkOutPage.clickOnContinueButtonForPaymentMethod();

        // * 2.25	Verify the message “Warning: Payment method required!”
        String actualWarningText = checkOutPage.verifyWarningMessageForPaymentMethod();
        String expectedWarningText = "Warning: Payment method required!\n×";
        Assert.assertEquals(actualWarningText, expectedWarningText, "Incorrect warning message displayed!");
    }
}
