package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {
    By text = By.cssSelector("div[class='product-name'] h1");
    By price = By.xpath("//span[@id='price-value-20']");
    By changeQuantity = By.id("product_enteredQuantity_20");
    By clickCart = By.id("add-to-cart-button-20");
    By message = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//li[@id='topcartlink']");

    //2.6 Verify the text “Nokia Lumia 1020”
    public String getProductName() {
        return getTextFromElement(text);
    }

    //2.7 Verify the price “$349.00”
    public String getPrice() {
        return getTextFromElement(price);
    }

    //2.8 Change quantity to 2
    public void setChangeQuantity() {
        clearTextField(changeQuantity);
        sendTextToElement(changeQuantity, "2");
    }


    public void clickOnAddToCart() {
        clickOnElement(clickCart);
    }

    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
    public String getProductAddToCartMessage() {
        return getTextFromElement(message);
    }

    // close the bar clicking on the cross button
    public void clickOnCrossButton() {
        clickOnElement(crossButton);
    }

    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCartAndClick() {
        mouseHoverToElementAndClick(shoppingCart);

    }
}
