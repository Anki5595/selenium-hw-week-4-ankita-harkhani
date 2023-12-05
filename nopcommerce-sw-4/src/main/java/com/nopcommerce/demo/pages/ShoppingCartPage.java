package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    //COMPUTER TAB
    //2.15 Verify the message "Shopping cart"
    By message = By.cssSelector("div[class='page-title'] h1");

    public String getShoppingCartMessage() {
        return getTextFromElement(message);
    }

    // * 2.16	Change the Qty to "2" and Click on "Update shopping cart"
    By clearField = By.xpath("//input[@class='qty-input']");
    By quantityField = By.xpath("//input[@class='qty-input']");

    public void quantityField() {
        clearTextField(clearField);
        sendTextToElement(quantityField, "2");
    }

    //Click on "Update shopping cart"
    By click = By.xpath("//button[@id='updatecart']");

    public void clickOnUpdateShoppingCart() {
        clickOnElement(click);
    }

    //2.17 Verify the Total"$2,950.00"
    By total = By.xpath("//span[@class='product-subtotal']");

    public String getTotal() {
        return getTextFromElement(total);
    }

    //2.18 click on checkbox “I agree with the terms of service”
    By clickCheckBox = By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]");

    public void clickOnAgreeCheckBox() {
        clickOnElement(clickCheckBox);
    }

    //2.19 Click on “CHECKOUT”
    By clickCheckOut = By.id("checkout");

    public void clickOnCheckOut() {
        clickOnElement(clickCheckOut);
    }


    //ELECTRONIC TAB
    //2.13 Verify the quantity is 2
    By checkTheQuantity = By.xpath("//span[contains(text(),'(2)')]");
    public String verifyTheQuantityIsTwo(){
        return getTextFromElement(checkTheQuantity);
    }
//    By quantity = By.xpath("//input[@class = 'qty-input']");
//    public String verifyQuantity(String value) {
//        return getAttributeValue(quantity, value);
//    }

//   //2.13 Verify the quantity is 2
//    By verifyQuantity2 = (By.xpath("//input[@class = 'qty-input']"));
//    public String verifyQuantityText() {
//        return getTextFromElement(verifyQuantity2);
//    }
    //2.14 Verify the Total $698.00
    By verifyTotal = By.xpath("//span[@class='product-subtotal']");

    public String verifyTotal() {
        return getTextFromElement(verifyTotal);
    }


}
