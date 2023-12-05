package com.tutorialsninja.testsuite;

import com.tutorialsninja.basetest.BaseTest;
import com.tutorialsninja.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktopTab();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = homePage.verifyDesktopsText();
        Assert.assertEquals(actualText, expectedText, "No navigate to the page");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNotebook();

        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");

        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = homePage.verifyLaptopAndNoteText();
        Assert.assertEquals(actualText, expectedText, "No navigate to the page");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.clickOnComponents();

        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        homePage.selectMenu("Show AllComponents");

        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = homePage.verifyComponentsText();
        Assert.assertEquals(actualText, expectedText, "No navigate to the page");
    }
}
