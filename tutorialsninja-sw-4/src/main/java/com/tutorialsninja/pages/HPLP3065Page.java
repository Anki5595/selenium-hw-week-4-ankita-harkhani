package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HPLP3065Page extends Utility {

    //2.7 Verify the Text "HP LP3065"
    By text = By.xpath("//a[normalize-space()='HP LP3065']");

    public String verifyHPLP3065Text() {
        return getTextFromElement(text);
    }

    //2.8 Select Delivery Date "2023-11-27"
    By deliveryDate = By.xpath("//input[@id='input-option225']");

    public void selectDeliverDate(String date) {
        clearTextField(deliveryDate);
        sendTextToElement(deliveryDate, date);
    }

    //2.9.Enter Qty "1” using Select class.

    By Qty1 = By.name("quantity");

    public void enterQty1(String value) {
        clearTextField(Qty1);
        sendTextToElement(Qty1, value);
    }

    //2.10 Click on “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By message = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public String verifySuccessMessageToAddInCart() {
        return getTextFromElement(message);
    }

    //2.12 Click on link “shopping cart” display into success message
    By click = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCart() {
        clickOnElement(click);
    }

}
