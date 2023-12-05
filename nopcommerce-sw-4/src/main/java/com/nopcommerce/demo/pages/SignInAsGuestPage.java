package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInAsGuestPage extends Utility {

    //COMPUTER TAB
    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkOut = By.xpath("//button[normalize-space()='Checkout as Guest']");

    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomeSignInText() {
        return getTextFromElement(welcomeText);
    }

    //2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOut);
    }


    //ELECTRONICS TAB
    By registerLink = By.xpath("//button[normalize-space()='Register']");

    //2.18 Click on “REGISTER” tab
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}