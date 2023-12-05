package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utility {

    //call selectMenu method and pass the menu name
    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    public void selectMenu(String menu) {
        WebElement menuList = driver.findElement(By.linkText(menu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
//        List<WebElement> topMenuList = getListOfElements(topMenu);
//        try {
//            for (WebElement element : topMenuList) {
//                if (element.getText().equalsIgnoreCase(menu)) {
//                    element.click();
//                }
//            }
//        } catch (StaleElementReferenceException e) {
//            topMenuList = getListOfElements(topMenu);
//        }
    }

    //1.1 Mouse hover on “Desktops” Tab and click
    By desktop = By.linkText("Desktops");

    public void clickOnDesktopTab() {
        mouseHoverToElementAndClick(desktop);
    }

    //1.3 Verify the text ‘Desktops’
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");

    public String verifyDesktopsText() {
        return getTextFromElement(desktopText);

    }

    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    By laptopAndNotebook = By.xpath("//a[normalize-space()='Laptops & Notebooks']");

    public void clickOnLaptopAndNotebook() {
        mouseHoverToElementAndClick(laptopAndNotebook);
    }

    //2.3 Verify the text ‘Laptops & Notebooks’
    By laptopAndNoteBookText = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    public String verifyLaptopAndNoteText() {
        return getTextFromElement(laptopAndNoteBookText);
    }

    //3.1 Mouse hover on “Components” Tab and click
    By components = By.xpath("//a[normalize-space()='Components']");

    public void clickOnComponents() {
        mouseHoverToElementAndClick(components);
    }

    //3.3 Verify the text ‘Components’
    By componentsText = By.xpath("//h2[normalize-space()='Components']");

    public String verifyComponentsText() {
        return getTextFromElement(componentsText);
    }

    //2.1 Mouse hover on Currency Dropdown and click
    By dropdown = By.xpath("//button[@class='btn btn-link dropdown-toggle']");

    public void mouseHoverOnCurrencyDropdownAndClick() {
        mouseHoverToElementAndClick(dropdown);
    }

    //2.2 Mouse hover on £Pound Sterling and click
    By sterling = By.xpath("//button[normalize-space()='£Pound Sterling']");

    public void mouseHoverOnPoundAndClick() {
        mouseHoverToElementAndClick(sterling);
    }

    // * 1.1	Click on My Account Link.
    By accountLink = By.xpath("//span[normalize-space()='My Account']");

    public void clickOnAccountLink() {
        clickOnElement(accountLink);
    }
}




