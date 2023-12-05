package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.basetest.BaseTest;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnWomenMenu(); // * * Mouse Hover on Women Menu

        Thread.sleep(1000);
        homePage.mouseHoverOnTopsLink();  // * * Mouse Hover on Tops

        Thread.sleep(1000);
        homePage.mouseHoverOnJacketsLink();  // * * Click on Jackets

        jacketsPage.sortByproductName(); // * * Select Sort By filter “Product Name”

        jacketsPage.displayProductInAlphabeticalOrder();  // * * Verify the products name display in alphabetical order
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnWomenMenu(); // * * Mouse Hover on Women Menu

        Thread.sleep(1000);
        homePage.mouseHoverOnTopsLink();  // * * Mouse Hover on Tops

        Thread.sleep(1000);
        homePage.mouseHoverOnJacketsLink();  // * * Click on Jackets

        jacketsPage.sortByPrice();  // * * Select Sort By filter “Price”

        jacketsPage.displayPriceInLowToHigh();  // * * Verify the products price display in Low to High
    }


}


