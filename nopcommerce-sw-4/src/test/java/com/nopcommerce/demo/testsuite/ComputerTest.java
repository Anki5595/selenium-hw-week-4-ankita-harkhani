package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInAsGuestPage signInAsGuestPage = new SignInAsGuestPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnComputerMenu(); //1.1 Click on Computer Menu.
        homePage.ClickOnDesktop(); //1.2 Click on Desktop
        desktopPage.descendingOrder("Name: Z to A"); //1.3 Select Sort By position "Name: Z to A

        // * 1.4 Verify the Product will arrange in Descending order.
        ArrayList<String> actualList = getArrayListFromWebElements(desktopPage.listOfProductsName());
        actualList.sort(String.CASE_INSENSITIVE_ORDER.reversed());// actual list in reverse order
        System.out.println("actual list: " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(desktopPage.listOfProductsName());
        expectedList.sort(String.CASE_INSENSITIVE_ORDER.reversed());//expected list in reverse order
        System.out.println("expected: " + expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in descending order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerMenu(); //2.1 Click on Computer Menu.

        homePage.ClickOnDesktop(); //2.2 Click on Desktop

        desktopPage.descendingOrder("Name: A to Z"); //2.3 Select Sort By position "Name: A to Z"

        desktopPage.addToCartLink(); //2.4 Click on "Add To Cart"

        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.verifyBuildYourOwnComputerText();
        Assert.assertEquals(actualText, expectedText, "Text dose not match");

        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200"); //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRAM("8GB [+$60.00]"); //2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectHDD(); //2.8 Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOSRadioButton(); //2.9 Select OS radio "Vista Premium [+$60.00]"

        Thread.sleep(2000);
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectSoftware();

        Thread.sleep(1000);
        //2.11 Verify the price "$1,475.00"
        String expectedValue = "$1,475.00";
        String actualValue = buildYourOwnComputerPage.getPriceText();
        Assert.assertEquals(actualValue, expectedValue, "The value is not same");

        buildYourOwnComputerPage.clickOnAddToCartLink(); //2.12 Click on "ADD TO CARD" Button.

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerPage.getMessageText();
        Assert.assertEquals(actualMessage, expectedMessage, "Message is not same");

        buildYourOwnComputerPage.clickOnCrossButton(); //After that close the bar clicking on the cross button.

        Thread.sleep(1000);
        buildYourOwnComputerPage.checkShoppingCart(); //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

        //2.15 Verify the message "Shopping cart"
        String expectedMsg = "Shopping cart";
        String actualMsg = shoppingCartPage.getShoppingCartMessage();
        Assert.assertEquals(actualMsg, expectedMsg, "Message is not match");

        shoppingCartPage.quantityField(); //2.16 Change the Qty to "2"

        shoppingCartPage.clickOnUpdateShoppingCart();//Click on "Update shopping cart"

        //2.17 Verify the Total"$2,950.00"
        String expectedTotal = "$2,950.00";
        String actualTotal = shoppingCartPage.getTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Total is not match");

        shoppingCartPage.clickOnAgreeCheckBox(); //2.18 click on checkbox “I agree with the terms of service”

        shoppingCartPage.clickOnCheckOut(); //2.19 Click on “CHECKOUT”

        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText1 = "Welcome, Please Sign In!";
        String actualText1 = signInAsGuestPage.getWelcomeSignInText();
        Assert.assertEquals(actualText1, expectedText1, "Incorrect Text!");

        signInAsGuestPage.clickOnCheckOutAsGuest(); //2.21Click on “CHECKOUT AS GUEST” Tab

        //2.22 Fill the all mandatory field
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterCountry();
        checkoutPage.enterCityName();
        checkoutPage.enterAddress();
        checkoutPage.enterPinCode();
        checkoutPage.enterPhoneNumber();

        checkoutPage.clickOnContinue();  //2.23 Click on “CONTINUE”

        checkoutPage.clickOnNextDayAirRadioButton(); //2.24 Click on Radio Button “Next Day Air($0.00)”

        checkoutPage.clickOnContinueButton(); //2.25 Click on “CONTINUE”

        checkoutPage.clickOnCreditCardButton();  //2.26 Select Radio Button “Credit Card”

        checkoutPage.clickOnContinueButton1(); //Click on “CONTINUE”

        checkoutPage.selectMasterCardFromDropDown();  //2.27 Select “Master card” From Select credit card dropdown

        checkoutPage.fillAllDetails(); //2.28 Fill all the details

        checkoutPage.clickToContinueButton(); //2.29 Click on “CONTINUE

        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMethod = "Credit Card";
        String actualMethod = checkoutPage.verifyPaymentMethod();
        Assert.assertEquals(actualMethod, expectedMethod, "Payment method is not Credit Card");

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShippingMethod = "Next Day Air";
        String actualShippingMethod = checkoutPage.verifyShippingMethod();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Payment shipping method is not Credit Card");

        //2.33 Verify Total is “$2,950.00”
        String expectedTotal1 = "$2,950.00";
        String actualTotal1 = checkoutPage.verifyTotal();
        Assert.assertEquals(actualTotal1, expectedTotal1, "The total is not same");

        checkoutPage.clickOnConfirm(); //2.34 Click on “CONFIRM”

        //2.35 Verify the Text “Thank You”
        String expected = "Thank you";
        String actual = thankYouPage.getThankYouText();
        Assert.assertEquals(actual, expected, "The text are not matched");

        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage1 = "Your order has been successfully processed!";
        String actualMessage1 = thankYouPage.getOrderHasBeenSuccessfullyProcessedMessage();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Message is not same");

        thankYouPage.clickOnContinue(); //2.37 Click on “CONTINUE”

        // 2.38 Verify the text “Welcome to our store”
        String expected1 = "Welcome to our store";
        String actual1 = homePage.getWelcomeText();
        Assert.assertEquals(actual1, expected1, "the text are not same");


    }
}

