package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    // Verify the text ‘Shopping Cart.'
    By text = By.xpath("//span[@class='base']");

    public String verifyTextShoppingCart() {
        return getTextFromElement(text);
    }

    // Verify the product name ‘Cronus Yoga Pant’
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    public String verifyProductName() {
        return getTextFromElement(productName);
    }

    // Verify the product size ‘32’
    By size = By.xpath("//dd[contains(text(),'32')]");

    public String verifySize32() {
        return getTextFromElement(size);
    }

    // Verify the product colour ‘Black’
    By colour = By.xpath("//dd[contains(text(),'Black')]");

    public String verifyColourBlack() {
        return getTextFromElement(colour);
    }

    // Verify the product name ‘Overnight Duffle’
    By name = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    public String verifyProductNameIsOvernightDuffle() {
        return getTextFromElement(name);
    }

    // * *	Verify the Qty is ‘3’
    By checkQuantity = By.xpath("//span[@class='counter-number']");

    public String verifyTheQuantityIsThree() {
        return getTextFromElement(checkQuantity);
    }

    // Verify the product price ‘$135.00’
    By price = By.xpath("(//span[@class='cart-price']//span)[2]");

    public String verifyProductPriceIs$135() {
        return getTextFromElement(price);
    }

    // Change Qty to ‘5’
    By Qty5 = By.xpath("(//input[@class='input-text qty'])[1]");

    public void changeQtyTo5(String value) {
        clearTextField(Qty5);
        sendTextToElement(Qty5, value);
    }

    // Click on ‘Update Shopping Cart’ button
    By click = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void clickOnUpdateShoppingCart() {
        clickOnElement(click);
    }

    // Verify the product price ‘$225.00’
    By productPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    public String verifyProductPriceIs$225() {
        return getTextFromElement(productPrice);
    }

}
