package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndBooksPage extends Utility {

    // * 1.3	Select Sort By "Price (High > Low)"
    By sortByPriceHighToLow = By.xpath("(//select[@id='input-sort'])[1]");
    By arrayListOfProducts = By.xpath("//p[@class ='price']");

    public void selectSortByPriceHighToLow(String options) {
        selectByVisibleTextFromDropDown(sortByPriceHighToLow, options);
        getArrayListOfProductsInChoice(arrayListOfProducts);

    }

    // * 1.4	Verify the Product price will arrange in High to Low order.
    public String verifyProductPriceArrangeInHighToLow() {
        return verifyTheProductArrangementInArrayList(arrayListOfProducts);
    }

    //2.3 Select Sort By "Price (High > Low)"
    By price = By.id("input-sort");

    public void sortByPrice(String option) {
        selectByVisibleTextFromDropDown(price, option);
    }

    //2.4 Select Product “MacBook”
    By product = By.linkText("MacBook");

    public void selectMacBookProduct() {
        clickOnElement(product);
    }
}
