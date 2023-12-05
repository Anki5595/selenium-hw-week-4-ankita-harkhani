package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {
    By thankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By message = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By clickContinue = By.xpath("//button[normalize-space()='Continue']");

    //2.35 Verify the Text “Thank You”
    public String getThankYouText() {
        return getTextFromElement(thankYou);
    }

    //2.36 Verify the message “Your order has been successfully processed!”
    public String getOrderHasBeenSuccessfullyProcessedMessage() {
        return getTextFromElement(message);
    }

    //2.37 Click on “CONTINUE”
    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }
}
