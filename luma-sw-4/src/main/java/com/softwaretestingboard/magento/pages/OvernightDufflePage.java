package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {

    // Verify the text ‘Overnight Duffle’
    By text = By.xpath("//span[@class='base']");

    public String verifyTextOvernightDuffle() {
        return getTextFromElement(text);
    }

    // Change Qty 3
    By Qty = By.id("qty");

    public void changeQtyTo3(String value) {
        clearTextField(Qty);
        sendTextToElement(Qty, value);
    }

    // Click on ‘Add to Cart’ Button.
    By clickAddToCart = By.xpath("//button[@id='product-addtocart-button']");

    public void clickOnAddToCart() {
        clickOnElement(clickAddToCart);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By text1 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public String verifyTextAddedOvernightDuffle() {
        return getTextFromElement(text1);
    }

    // Click on ‘shopping cart’ Link into message
    By clickShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCart() {
        clickOnElement(clickShoppingCart);
    }

}
