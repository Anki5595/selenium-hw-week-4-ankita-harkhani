package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsText = By.xpath("//h1[normalize-space()='Electronics']");

    public String getElectronicsText() {
        return getTextFromElement(electronicsText);
    }

}
