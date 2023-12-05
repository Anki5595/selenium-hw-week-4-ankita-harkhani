package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    By descendingOrder = By.id("products-orderby");
    By ascendingOrder = By.id("products-orderby");
    By addToCart = By.xpath("//a[text() = 'Build your own computer']");


    public void descendingOrder(String sort) {
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(descendingOrder, sort);
    }

    public void productBeforeSorting(By by) {
        //1.4 Verify the Product will arrange in Descending order.
        List<WebElement> ComputerElementsList = getListOfElements(by);
        List<String> computerNameListBefore = new ArrayList<>();
        for (WebElement value : ComputerElementsList) {
            computerNameListBefore.add(value.getText());
            computerNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        }
    }

    By sortByPosition = By.xpath("//select[@id='products-orderby']");
    public void selectSortByPosition(String value) {
        selectByValueFromDropDown(sortByPosition, value);
    }
    By productArrangements = By.xpath("//div[@class='details']/child::h2/a");
    //By productArrangements = By.xpath("//h2[@class='product-title']/a");
    public List<WebElement> listOfProductsName() {
        List<WebElement> listOfElement = findElementsList(productArrangements);
        return listOfElement;
    }



    //2.3 Select Sort By position "Name: A to Z"
    public void ascendingOrder(String sort) {
        selectByVisibleTextFromDropDown(ascendingOrder, sort);
    }

    //2.4 Click on "Add To Cart"
    public void addToCartLink() {
        mouseHoverToElementAndClick(addToCart);
    }
}
