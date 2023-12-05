package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    // * * Mouse Hover on Women Menu
    By womenMenu = By.xpath("//span[normalize-space()='Women']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    // * * Mouse Hover on Tops
    By topsLink = By.xpath("//a[@id='ui-id-9']");

    public void mouseHoverOnTopsLink() {
        mouseHoverToElement(topsLink);
    }

    // * * Click on Jackets
    By jacketsLink = By.id("ui-id-11");

    public void mouseHoverOnJacketsLink() {
        mouseHoverToElementAndClick(jacketsLink);
    }

    // Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    // Mouse Hover on Bottoms
    By bottomLink = By.xpath("//a[@id='ui-id-18']");

    public void mouseHoverOnBottomLink() {
        mouseHoverToElement(bottomLink);
    }

    // Click on Pants
    By pantsLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    public void mouseHoverOnPantsLink() {
        mouseHoverToElementAndClick(pantsLink);
    }

    // Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    // Click on Bags
    By bagsLink = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnBagsLink() {
        mouseHoverToElementAndClick(bagsLink);
    }

}
