package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {
    By listOfProducts = By.xpath("//h4/a");
    By descendingOrder = By.id("input-sort");

    public List<WebElement> getAllTitleOnPage() {
        List<WebElement> products = findElementsList(listOfProducts);
        return products;
    }

    public void sortByFilter(String option) {
        selectByVisibleTextFromDropDown(descendingOrder, option);

    }

    //2.3 Select Sort By position "Name: A to Z"
    By ascendingOrder = By.id("input-sort");

    public void sortByNameAToZPosition(String option) {
        selectByVisibleTextFromDropDown(ascendingOrder, option);
    }

    //2.4 Select product “HP LP3065”
    By click = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void selectHPLP3065Product() {
        clickOnElement(click);
    }
}
