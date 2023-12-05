package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.name("BillingNewAddress.Email");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.id("BillingNewAddress_City");
    By address = By.name("BillingNewAddress.Address1");
    By pinCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.cssSelector("#BillingNewAddress_PhoneNumber");
    By clickContinue = By.name("save");

    //2.22 Fill the all mandatory field
    public void enterFirstName() {
        //First Name
        sendTextToElement(firstName, "Michel");
    }

    public void enterLastName() {
        //Last name
        sendTextToElement(lastName, "Jackson");
    }

    public void enterEmail() {
        //Email
        sendTextToElement(email, "Jmicheljackson@gmail.com");
    }

    public void enterCountry() {
        //Country
        sendTextToElement(country, "India");
    }

    public void enterCityName() {
        //City
        sendTextToElement(city, "Junagadh");
    }

    public void enterAddress() {
        //Address1
        sendTextToElement(address, "Bhavnath");
    }

    public void enterPinCode() {
        //Zip/Pin code
        sendTextToElement(pinCode, "354609");
    }

    public void enterPhoneNumber() {
        //Phone number
        sendTextToElement(phoneNumber, "0987654321");
    }

    //2.23 Click on “CONTINUE”
    public void clickOnContinue() {
        clickOnElement(clickContinue);
    }

    //2.24 Click on Radio Button “Next Day Air($0.00)”
    By radioButton = By.xpath("(//div[@class='method-name'])[2]");

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(radioButton);
    }

    //2.25 Click on “CONTINUE”
    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    //2.26 Select Radio Button “Credit Card”
    By creditCardButton = By.xpath("//label[normalize-space()='Credit Card']");

    public void clickOnCreditCardButton() {
        clickOnElement(creditCardButton);
    }

    //Click on “CONTINUE”
    By clickOnContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickOnContinueButton1() {
        clickOnElement(clickOnContinue);
    }

    //2.27 Select “Master card” From Select credit card dropdown
    By masterCard = By.xpath("//select[@id='CreditCardType']");

    public void selectMasterCardFromDropDown() {
        selectByVisibleTextFromDropDown(masterCard, "Master card");
    }

    //2.28 Fill all the details
    By cardHolderName = By.name("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expiryDate = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.id("ExpireYear");
    By cardCode = By.name("CardCode");

    public void fillAllDetails() {
        //CardholderName
        sendTextToElement(cardHolderName, "Michel Jackson");
        //CardNumber
        sendTextToElement(cardNumber, "0000 0000 0000 0000");
        //ExpiryDate
        selectByIndexFromDropDown(expiryDate, 5);
        //ExpiryYear
        selectByValueFromDropDown(expiryYear, "2030");
        //CardCode
        sendTextToElement(cardCode, "000");
    }

    //2.29 Click on “CONTINUE
    By clickToContinue = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void clickToContinueButton() {
        clickOnElement(clickToContinue);
    }

    //2.30 Verify “Payment Method” is “Credit Card”
    By paymentMethod = By.xpath("//span[normalize-space()='Credit Card']");

    public String verifyPaymentMethod() {
        return getTextFromElement(paymentMethod);
    }

    //2.32 Verify “Shipping Method” is “Next Day Air”
    By shippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");

    public String verifyShippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    //2.33 Verify Total is “$2,950.00”
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    //2.34 Click on “CONFIRM”
    By confirm = By.xpath("//button[normalize-space()='Confirm']");

    public void clickOnConfirm() {
        clickOnElement(confirm);
    }

    //2.29 Click on Radio Button “2nd Day Air ($0.00)” // Electronics
    By dayAirRadio = By.xpath("(//div[@class='method-name'])[3]");

    public void clickOn2ndDayAirButton() {
        clickOnElement(dayAirRadio);
    }

    //2.32 Select “Visa” From Select credit card dropdown
    By visaCard = By.xpath("//select[@id='CreditCardType']");

    public void selectVisaCardFromDropDown() {
        selectByVisibleTextFromDropDown(visaCard, "Visa");
    }

    //2.32 Verify “Shipping Method” is “2nd Day Air”
    By shippingMethod1 = By.xpath("//span[normalize-space()='2nd Day Air']");

    public String verifyShippingMethod1() {
        return getTextFromElement(shippingMethod1);
    }

    //2.37 Verify Total is “$698.00”
    By verifyTotal = By.xpath("//span[@class='product-subtotal']");

    public String verifyTotal1() {
        return getTextFromElement(verifyTotal);
    }


}
