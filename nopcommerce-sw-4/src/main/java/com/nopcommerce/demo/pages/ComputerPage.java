package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computerText = By.xpath("//h1[normalize-space()='Computers']");

    public String getComputerText() {
        return getTextFromElement(computerText);
    }

}



