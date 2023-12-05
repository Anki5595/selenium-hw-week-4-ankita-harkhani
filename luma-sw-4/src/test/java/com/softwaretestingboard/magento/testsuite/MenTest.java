package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.basetest.BaseTest;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    PantsPage pantspage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnMenMenu(); // Mouse Hover on Men Menu

        Thread.sleep(1000);
        homePage.mouseHoverOnBottomLink();// Mouse Hover on Bottoms

        Thread.sleep(1000);
        homePage.mouseHoverOnPantsLink(); //click on pant link

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        pantspage.mouseHoverCronusYogaPant();
        //and click on size 32.
        pantspage.clickOnSize(32);

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        pantspage.mouseHoverAndClickOnColour("Black");

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        pantspage.mouseHoverToCronusYogaPant();

        // and click on ‘Add To Cart’ Button.
        Thread.sleep(1000);
        pantspage.clickOnAddToCartButton();

        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Thread.sleep(1000);
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantspage.getTextCronusYogaPantAdded();
        Assert.assertEquals(actualText, expectedText, "Text is not matched");

        pantspage.clickOnShoppingCartLinkInsideMessage();//* Click on ‘shopping cart’ Link into message

        //* Verify the text ‘Shopping Cart.’
        Thread.sleep(500);
        String expected = "Shopping Cart";
        String actual = shoppingCartPage.verifyTextShoppingCart();
        Assert.assertEquals(actual, expected, "Text is not matched");

        //* Verify the product name ‘Cronus Yoga Pant’
        Thread.sleep(500);
        String expectedName = "Cronus Yoga Pant";
        String actualName = shoppingCartPage.verifyProductName();
        Assert.assertEquals(actualName, expectedName, "Product Name is not matched");

        //* Verify the product size ‘32’
        Thread.sleep(500);
        String expectedSize = "32";
        String actualSize = shoppingCartPage.verifySize32();
        Assert.assertEquals(actualSize, expectedSize, "Product Size is not matched");

        //* Verify the product colour ‘Black’
        Thread.sleep(500);
        String expectedColour = "Black";
        String actualColour = shoppingCartPage.verifyColourBlack();
        Assert.assertEquals(actualColour, expectedColour, "Product Colour is not matched");
    }
}

