package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInAsGuestPage signInAsGuestPage = new SignInAsGuestPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.mouseHoverOnElectronicTab(); //1.1 Mouse Hover on “Electronics” Tab

        homePage.mouseHoverOnCellPhoneAndClick(); // 1.2 Mouse Hover on “Cell phones” and click

        // 1.3 Verify the text “Cell phones”
        String expected = "Cell phones";
        String actual = homePage.getCellPhoneText();
        Assert.assertEquals(actual, expected, "The text are not matched");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicTab(); //2.1 Mouse Hover on “Electronics” Tab

        homePage.mouseHoverOnCellPhoneAndClick(); // 2.2 Mouse Hover on “Cell phones” and click

        // 2.3 Verify the text “Cell phones”
        String expected = "Cell phones";
        String actual = homePage.getCellPhoneText();
        Assert.assertEquals(actual, expected, "The text are not matched");

        cellPhonesPage.clickListView(); //2.4 Click on List View Tab

        Thread.sleep(2000);
        cellPhonesPage.clickOnProductName(); //2.5 Click on product name “Nokia Lumia 1020” link

        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedText = "Nokia Lumia 1020";
        String actualText = nokiaLumiaPage.getProductName();//2.9 Click on “ADD TO CART” tab
        Assert.assertEquals(actualText, expectedText, "The text are not matched");

        //2.7 Verify the price “$349.00”
        String expectedPrice = "$349.00";
        String actualPrice = nokiaLumiaPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "The text are not matched");

        nokiaLumiaPage.setChangeQuantity(); //2.8 Change quantity to 2

        nokiaLumiaPage.clickOnAddToCart(); //2.9 Click on “ADD TO CART” tab

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = nokiaLumiaPage.getProductAddToCartMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "The text are not matched");

        nokiaLumiaPage.clickOnCrossButton();// close the bar clicking on the cross button

        Thread.sleep(2000);
        nokiaLumiaPage.mouseHoverOnShoppingCartAndClick();  //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

        Thread.sleep(1000);
        //2.12 Verify the message "Shopping cart"
        String expectedMsg = "Shopping cart";
        String actualMsg = shoppingCartPage.getShoppingCartMessage();
        Assert.assertEquals(actualMsg, expectedMsg, "Message is not match");

        //2.13 Verify the quantity is 2
        String expectedQuantity = "(2)";
        String actualQuantity = shoppingCartPage.verifyTheQuantityIsTwo();
        Assert.assertEquals(actualQuantity, expectedQuantity, "Quantity is not match");

        //2.14 Verify the Total $698.00
        String expectedTotal = "$698.00";
        String actualTotal = shoppingCartPage.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Total is not match");

        shoppingCartPage.clickOnAgreeCheckBox(); //2.15 click on checkbox “I agree with the terms of service”

        shoppingCartPage.clickOnCheckOut(); //2.16 Click on “CHECKOUT”

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText1 = "Welcome, Please Sign In!";
        String actualText1 = signInAsGuestPage.getWelcomeSignInText();
        Assert.assertEquals(actualText1, expectedText1, "Incorrect Text!");

        signInAsGuestPage.clickOnRegisterLink(); //2.18 Click on “REGISTER” tab

        //2.19 Verify the text “Register”
        String expectedTxt = "Register";
        String actualTxt = registerPage.verifyRegisterText();
        Assert.assertEquals(actualTxt, expectedTxt, "Incorrect Text!");

        registerPage.fillTheMandatoryFields(); //2.20 Fill the mandatory fields

        registerPage.clickOnRegister(); //2.21 Click on “REGISTER” Button

        //2.22 Verify the message “Your registration completed”
        String expectedMessage1 = "Your registration completed";
        String actualMessage1 = registerPage.verifyRegistrationText();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Incorrect Text!");

        registerPage.clickContinue(); //2.23 Click on “CONTINUE” tab

        //2.24 Verify the message "Shopping cart"
        String expectedMsg1 = "Shopping cart";
        String actualMsg1 = shoppingCartPage.getShoppingCartMessage();
        Assert.assertEquals(actualMsg1, expectedMsg1, "Message is not match");

        //Login In Again
        //Click on login button
        loginPage.clickOnLoginButton();

        //Verify the Text "Welcome, Please Sign In!"
        String actualWelcome = loginPage.welcomeMessage();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome, "Incorrect welcome text displayed!");
        loginPage.welcomeMessage();

        //Enter Email into the email field
        loginPage.enterEmailAddress(RegisterPage.generatedEmail);

        //Enter Password into the password field
        loginPage.enterPassword("1234560");

        loginPage.clickOnLogin();

        shoppingCartPage.clickOnAgreeCheckBox(); //2.25 click on checkbox “I agree with the terms of service”

        shoppingCartPage.clickOnCheckOut(); //2.26 Click on “CHECKOUT”

        //2.27 Fill the Mandatory fields
        checkoutPage.enterCountry();
        checkoutPage.enterCityName();
        checkoutPage.enterAddress();
        checkoutPage.enterPinCode();
        checkoutPage.enterPhoneNumber();

        checkoutPage.clickOnContinue(); //2.28 Click on Continue

        checkoutPage.clickOn2ndDayAirButton(); //2.29 Click on Radio Button “2nd Day Air ($0.00)”

        checkoutPage.clickOnContinueButton(); //2.30 click on continue button

        checkoutPage.clickOnCreditCardButton(); //2.31 Click on credit card

        checkoutPage.clickOnContinueButton1(); // click on continue button

        checkoutPage.selectVisaCardFromDropDown();  //2.32 Select “Visa” From Select credit card dropdown

        checkoutPage.fillAllDetails(); //2.33 Fill all the details

        checkoutPage.clickToContinueButton(); //2.34 Click on “CONTINUE

        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedMethod = "Credit Card";
        String actualMethod = checkoutPage.verifyPaymentMethod();
        Assert.assertEquals(actualMethod, expectedMethod, "Payment method is not Credit Card");

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = checkoutPage.verifyShippingMethod1();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Payment shipping method is not Credit Card");

        //2.37 Verify Total is “$698.00”
        String expectedTotal1 = "$698.00";
        String actualTotal1 = checkoutPage.verifyTotal1();
        Assert.assertEquals(actualTotal1, expectedTotal1, "Total is not match");

        checkoutPage.clickOnConfirm();  //2.38 Click on “CONFIRM”

        //2.39 Verify the Text “Thank You”
        String expected1 = "Thank you";
        String actual1 = thankYouPage.getThankYouText();
        Assert.assertEquals(actual1, expected1, "The text are not matched");

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedResult = "Your order has been successfully processed!";
        String actualResult = thankYouPage.getOrderHasBeenSuccessfullyProcessedMessage();
        Assert.assertEquals(actualResult, expectedResult, "Message is not same");

        thankYouPage.clickOnContinue(); //2.41 Click on “CONTINUE”

        // 2.42 Verify the text “Welcome to our store”
        String expectedTxt1 = "Welcome to our store";
        String actualTxt1 = homePage.getWelcomeText();
        Assert.assertEquals(actualTxt1, expectedTxt1, "the text are not same");

        homePage.clickOnLogOutLink(); //2.43 Click on “Logout” link

        //2.44 Verify the URL is “https://demo.nopcommerce.com/"
        String baseUrl = "https://demo.nopcommerce.com/";
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "the text are not same");
        System.out.println("Current Url: " + baseUrl);
    }

}

