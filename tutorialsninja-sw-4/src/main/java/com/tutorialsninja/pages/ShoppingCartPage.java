package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    //2.11 Verify the text "Shopping Cart"
    By text = By.xpath("//div[@id='content']//h1");

    public String verifyShoppingCartText() {
        return getTextFromElement(text);
    }

    //2.12 Verify the Product name "HP LP3065"
    By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    public String verifyProductNameHPLP3065() {
        return getTextFromElement(productName);

    }

    //2.13 Verify the Delivery Date "2025-11-27"
    By date = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");

    public String verifyDate() {
        return getTextFromElement(date);
    }

    //2.14 Verify the Model "Product21"
    By model = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");

    public String verifyModelProduct21() {
        return getTextFromElement(model);
    }

    //2.15 Verify the Total "£74.73"
    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    // * 2.10	Verify the Product name "MacBook"
    By checkNameOfProductMacBook = By.xpath("(//a[contains(text(),'MacBook')])[2]");

    public String verifyProductNameIsMacBook() {
        return getTextFromElement(checkNameOfProductMacBook);
    }

    // * 2.11	Change Quantity "2"
    By clearTheQtyBox = By.xpath("//input[@class='form-control']");

    public void clearTheQtyBox() {
        clearTextField(clearTheQtyBox);
    }

    By changeQuantity = By.xpath("//input[@class='form-control']");

    public void enterQuantityIntoTheBox(String qty) {
        sendTextToElement(changeQuantity, qty);
    }

    // * 2.12	Click on “Update” Tab
    By updateTheBox = By.xpath("(//button[@type='submit'])[1]");

    public void clickOnUpdateTheQuantityBox() {
        clickOnElement(updateTheBox);
    }

    // * 2.13	Verify the message “Success: You have modified your shopping cart!”
    By modifiedSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public String verifyUpdatedSuccessMessage() {
        return getTextFromElement(modifiedSuccessMessage);
    }

    // * 2.14	Verify the Total £737.45
    By totalPrice = By.xpath("(//td[contains(text(),'£737.45')])[3]");

    public String verifyTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    // * 2.15	Click on “Checkout” button
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }
}


