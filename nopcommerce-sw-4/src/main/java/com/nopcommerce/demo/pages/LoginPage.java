package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //Click on login button
    By loginButton = By.linkText("Log in");
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    //Verify the Text "Welcome, Please Sign In!"

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String welcomeMessage(){
        return getTextFromElement(welcomeText);
    }

    //Enter Email into the email field
    By enterEmail = By.id("Email");
    public void enterEmailAddress (String email){
        sendTextToElement(enterEmail, email);
    }

    //Enter Password into the password field
    By enterPassword = By.name("Password");
    public void enterPassword(String password1){
        sendTextToElement(enterPassword, password1);
    }

    //Click on Login button
    By clickLogin = By.xpath("//button[contains(text(),'Log in')]");
    public void clickOnLogin(){
        clickOnElement(clickLogin);
    }
}

