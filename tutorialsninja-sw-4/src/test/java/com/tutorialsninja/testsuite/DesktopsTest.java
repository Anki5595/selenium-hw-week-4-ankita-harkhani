package com.tutorialsninja.testsuite;

import com.tutorialsninja.basetest.BaseTest;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HPLP3065Page;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktopTab();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");

        //1.3 Select Sort By position "Name: Z to A"
        // Get all the products name and stored into array list
        List<WebElement> list = desktopsPage.getAllTitleOnPage();
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : list) {
            originalList.add(e.getText());
        }
        System.out.println(originalList);
        // Sort By Reverse order
        Collections.reverse(originalList);
        System.out.println(originalList);

        desktopsPage.sortByFilter("Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        list = desktopsPage.getAllTitleOnPage();
        for (WebElement e : list) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(originalList, afterSortByZToAProductsName, "Product not sorted into Z to A order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverOnCurrencyDropdownAndClick();

        //2.2 Mouse hover on £Pound Sterling and click
        homePage.mouseHoverOnPoundAndClick();

        //2.3 Mouse hover on Desktops Tab.
        homePage.clickOnDesktopTab();

        //2.4 Click on “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");

        //2.5 Select Sort By position "Name: A to Z"
        desktopsPage.sortByNameAToZPosition("Name (A - Z)");

        //2.6 Select product “HP LP3065”
        desktopsPage.selectHPLP3065Product();

        //2.7 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = hplp3065Page.verifyHPLP3065Text();
        Assert.assertEquals(actualText, expectedText, "Incorrect Text!");

        //2.8 Select Delivery Date "2023-11-27"
        Thread.sleep(2000);
        hplp3065Page.selectDeliverDate("2023-11-27");

        //2.9.Enter Qty "1” using Select class.
        hplp3065Page.enterQty1("1");

        //2.10 Click on “Add to Cart” button
        hplp3065Page.clickOnAddToCartButton();

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n×";
        String actualMessage = hplp3065Page.verifySuccessMessageToAddInCart();
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Text!");

        //2.12 Click on link “shopping cart” display into success message
        Thread.sleep(1000);
        hplp3065Page.clickOnShoppingCart();

        //2.13 Verify the text "Shopping Cart"
        String expectedTxt = "Shopping Cart  (1.00kg)";
        String actualTxt = shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualTxt, expectedTxt, "Incorrect Text!");

        //2.14 Verify the Product name "HP LP3065"
        String expectedName = "HP LP3065";
        String actualName = shoppingCartPage.verifyProductNameHPLP3065();
        Assert.assertEquals(actualName, expectedName, "Incorrect Text!");

        //2.15 Verify the Delivery Date "2023-11-27"
        String expectedDate = "Delivery Date:2023-11-27";
        String actualDate = shoppingCartPage.verifyDate();
        Assert.assertEquals(actualDate, expectedDate, "Incorrect Date!");

        //2.16 Verify the Model "Product21"
        String expectedModel = "Product 21";
        String actualModel = shoppingCartPage.verifyModelProduct21();
        Assert.assertEquals(actualModel, expectedModel, "Incorrect Model!");

        //2.17 Verify the Total "£74.73"
        String expectedTotal = "£74.73";
        String actualTotal = shoppingCartPage.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Incorrect Total!");

    }


}

