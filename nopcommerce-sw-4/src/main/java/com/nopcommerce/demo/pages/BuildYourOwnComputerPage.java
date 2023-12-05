package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    //2.5 Verify the Text "Build your own computer"
    By titleText = By.xpath("//h1[normalize-space()='Build your own computer']");

    public String verifyBuildYourOwnComputerText() {
        return getTextFromElement(titleText);
    }

    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By processor = By.xpath("//select[@id='product_attribute_1']");

    public void selectProcessor(String Text) {
        selectByVisibleTextFromDropDown(processor, Text);
    }

    //2.7.Select "8GB [+$60.00]" using Select class.
    By RAM = By.xpath("//select[@id='product_attribute_2']");

    public void selectRAM(String Text) {
        selectByVisibleTextFromDropDown(RAM, Text);
    }

    //2.8 Select HDD radio "400 GB [+$100.00]"
    By HDD = By.id("product_attribute_3_7");

    public void selectHDD() {
        clickOnElement(HDD);
    }

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    By OS = By.id("product_attribute_4_9");

    public void selectOSRadioButton() {
        clickOnElement(OS);
    }

    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By msOfficeCheckBox = By.id("product_attribute_5_12");

    // By totalCommanderCheckBox = By.id("product_attribute_5_12");
    public void selectSoftware() {
        clickOnElement(msOfficeCheckBox);
        //  clickOnElement(totalCommanderCheckBox);
    }

    //2.11 Verify the price "$1,475.00"
    By price = By.id("price-value-1");

    public String getPriceText() {
        return getTextFromElement(price);
    }

    //2.12 Click on "ADD TO CARD" Button
    By addToCartLink = By.id("add-to-cart-button-1");

    public void clickOnAddToCartLink() {
        clickOnElement(addToCartLink);
    }

    //2.13 Verify the Message "The product has been added to your shopping cart"
    By message = By.xpath("//p[@class='content']");

    public String getMessageText() {
        return getTextFromElement(message);
    }

    //After that close the bar clicking on the cross button.
    By crossButton = By.xpath("//span[@title='Close']");

    public void clickOnCrossButton() {
        clickOnElement(crossButton);
    }

    // * 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By verifyShoppingCart = By.xpath("(//a[@class='ico-cart'])[1]");
    public void checkShoppingCart(){
        mouseHoverToElementAndClick(verifyShoppingCart);

    }


}