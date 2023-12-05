package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Utility {
    public static String generatedEmail;

    //2.19 Verify the text “Register”
    By registerText = By.xpath("//h1[normalize-space()='Register']");

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    //2.20 Fill the mandatory fields
    By radioButton = By.xpath("//span[@class='male']");
    By firstName = By.name("FirstName");
    By lastName = By.id("LastName");
    By day = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By email = By.name("Email");
    By password = By.xpath("//input[starts-with(@id, 'Password')]");
    By confirmPassword = By.xpath("//input[starts-with(@id, 'ConfirmPassword')]");

    public void fillTheMandatoryFields() {
        //click on radio button
        clickOnElement(radioButton);
        //FirstName
        sendTextToElement(firstName, "Michel");
        //LastName
        sendTextToElement(lastName, "Jackson");
        //Date of Birth
        selectByIndexFromDropDown(day, 5);
        selectByVisibleTextFromDropDown(month, "May");
        selectByValueFromDropDown(year, "1995");
        //Email
        //Generate A random Email
        By email = By.id("Email");
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "michel" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        sendTextToElement(email, generatedEmail);

//        final String randomEmail = randomEmail();
//        sendTextToElement(email, randomEmail);
        //Password
        sendTextToElement(password, "1234560");
        //ConfirmPassword
        sendTextToElement(confirmPassword, "1234560");
    }

    //2.21 Click on “REGISTER” Button
    By registerButton = By.name("register-button");

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    //2.22 Verify the message “Your registration completed”
    By Text = By.xpath("//div[text()='Your registration completed']");

    public String verifyRegistrationText() {
        return getTextFromElement(Text);
    }

    //2.23 Click on “CONTINUE” tab
    By continueButton = By.xpath("//a[normalize-space()='Continue']");

    public void clickContinue() {
        clickOnElement(continueButton);
    }


//    private String randomEmail() {
//        return "random-" + UUID.randomUUID().toString() + "@example.com";
//
//    }
}
