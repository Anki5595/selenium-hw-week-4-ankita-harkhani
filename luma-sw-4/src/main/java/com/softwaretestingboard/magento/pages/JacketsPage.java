package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JacketsPage extends Utility {
    // * * Select Sort By filter “Product Name”
    By productNameFilter = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");

    public void sortByproductName() {
        selectByVisibleTextFromDropDown(productNameFilter, "Product Name");

    }
    // * * Verify the products name display in alphabetical order
    By display = By.xpath("//strong[@class = 'product name product-item-name']");

    public void displayProductInAlphabeticalOrder() {
        List<WebElement> element1 = driver.findElements(display);
        for (WebElement result : element1) {
            System.out.println(result.getText());
        }
    }

    // * * Select Sort By filter “Price”
    By priceFilter = By.id("sorter");

    public void sortByPrice() {
        selectByVisibleTextFromDropDown(priceFilter, "Price");
    }

    // * * Verify the products price display in Low to High
    By priceDisplay = By.xpath("//span[@class ='price-wrapper ']");

    public void displayPriceInLowToHigh() {
        List<WebElement> element1 = driver.findElements(priceDisplay);
        for (WebElement result : element1) {
            System.out.println(result.getText());
        }
    }



}



