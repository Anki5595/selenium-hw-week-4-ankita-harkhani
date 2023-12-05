package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.basetest.BaseTest;
import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        Thread.sleep(500);
        homePage.mouseHoverOnGearMenu(); //Mouse Hover on Gear Menu

        Thread.sleep(500);
        homePage.mouseHoverOnBagsLink(); //* Click on Bags

        //* Click on Product Name ‘Overnight Duffle’
        bagsPage.clickOnOvernightDuffle();

        //* Verify the text ‘Overnight Duffle’
        Thread.sleep(500);
        String expected = "Overnight Duffle";
        String actual = overnightDufflePage.verifyTextOvernightDuffle();
        Assert.assertEquals(actual, expected, "Text is not matched");

        //* Change Qty 3
        Thread.sleep(1000);
        overnightDufflePage.changeQtyTo3("3");

        //* Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnAddToCart();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Thread.sleep(500);
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = overnightDufflePage.verifyTextAddedOvernightDuffle();
        Assert.assertEquals(actualText, expectedText, "Text is not matched");

        //* Click on ‘shopping cart’ Link into message
        Thread.sleep(500);
        overnightDufflePage.clickOnShoppingCart();

        //* Verify the product name ‘Overnight Duffle’
        Thread.sleep(500);
        String expectedName = "Overnight Duffle";
        String actualName = shoppingCartPage.verifyProductNameIsOvernightDuffle();
        Assert.assertEquals(actualName, expectedName, "Text is not matched");

        //* Verify the Qty is ‘3’
        Thread.sleep(2000);
        String actualProductQuantity = shoppingCartPage.verifyTheQuantityIsThree();
        String expectedProductQuantity = "3";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity, "Incorrect Quantity Displayed!");

        //* Verify the product price ‘$135.00’
        Thread.sleep(500);
        String expectedPrice = "$135.00";
        String actualPrice = shoppingCartPage.verifyProductPriceIs$135();
        Assert.assertEquals(actualPrice, expectedPrice, "Text is not matched");

        //* Change Qty to ‘5’
        Thread.sleep(1000);
        shoppingCartPage.changeQtyTo5("5");

        //* Click on ‘Update Shopping Cart’ button
        Thread.sleep(1000);
        shoppingCartPage.clickOnUpdateShoppingCart();

        //* Verify the product price ‘$225.00'
        Thread.sleep(2000);
        String expectedAmount = "$225.00";
        String actualAmount = shoppingCartPage.verifyProductPriceIs$225();
        Assert.assertEquals(actualAmount, expectedAmount, "Text is not matched");
    }
}
