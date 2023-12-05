package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    // COMPUTER TAB
    /* 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
     string
     1.2 This method should click on the menu whatever name is passed as parameter*/

    public void selectMenu(String menu) {
        By selectMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = '" + menu + "']");
        clickOnElement(selectMenuLink);
    }

    // 1.1 Click on Computer Menu.
    By computerMenuLink = By.xpath("//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[1]");

    public void clickOnComputerMenu() {
        clickOnElement(computerMenuLink);
    }

    //1.2 Click on Desktop
    By DesktopLink = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");

    public void ClickOnDesktop() {
        clickOnElement(DesktopLink);
    }

    //2.38 Verify the text “Welcome to our store”
    By welcomeText = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }


    //ELECTRONICS TAB

    //1.1 Mouse Hover on “Electronics” Tab
    By electronicTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    public void mouseHoverOnElectronicTab() {
        mouseHoverToElement(electronicTab);
    }

    // 1.2 Mouse Hover on “Cell phones” and click
    By clickCellPhones = By.xpath("(//a[normalize-space()='Cell phones'])[1]");

    public void mouseHoverOnCellPhoneAndClick() {
        mouseHoverToElementAndClick(clickCellPhones);
    }

    // 1.3 Verify the text “Cell phones”
    By cellPhoneText = By.cssSelector("div[class='page-title'] h1");

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    //2.43 Click on “Logout” link
    By logOut = By.xpath("(//a[normalize-space()='Log out'])[1]");

    public void clickOnLogOutLink() {
        clickOnElement(logOut);
    }


}

