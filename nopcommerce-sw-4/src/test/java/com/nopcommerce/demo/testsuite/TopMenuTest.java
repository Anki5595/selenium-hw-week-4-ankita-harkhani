package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    //object creation to calling a variable from pages
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();


    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.
    @Test
    public void verifyPageNavigation() {
        homePage.selectMenu("Computers");
        String expectedText = "Computers";
        String actualText = computerPage.getComputerText();
        Assert.assertEquals(actualText, expectedText, "Error Message not displayed");

        homePage.selectMenu("Electronics");
        String expectedText1 = "Electronics";
        String actualText1 = electronicsPage.getElectronicsText();
        Assert.assertEquals(actualText1, expectedText1, "Error Message not displayed");

        homePage.selectMenu("Apparel");
        String expectedText2 = "Apparel";
        String actualText2 = apparelPage.getApparelText();
        Assert.assertEquals(actualText2, expectedText2, "Error Message not displayed");

        homePage.selectMenu("Digital downloads");
        String expectedText3 = "Digital downloads";
        String actualText3 = digitalDownloadsPage.getDigitalDownloadsText();
        Assert.assertEquals(actualText3, expectedText3, "Error Message not displayed");

        homePage.selectMenu("Books");
        String expectedText4 = "Books";
        String actualText4 = booksPage.getBooksText();
        Assert.assertEquals(actualText4, expectedText4,"Error Message not displayed");

        homePage.selectMenu("Jewelry");
        String expectedText5 = "Jewelry";
        String actualText5 = jewelryPage.getJewelryText();
        Assert.assertEquals(actualText5, expectedText5, "Error Message not displayed");

        homePage.selectMenu("Gift Cards");
        String expectedText6 = "Gift Cards";
        String actualText6 = giftCardsPage.getGiftCardsText();
        Assert.assertEquals(actualText6, expectedText6, "Error Message not displayed");

    }
}


