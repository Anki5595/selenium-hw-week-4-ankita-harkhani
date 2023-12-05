package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelText = By.xpath("//h1[normalize-space()='Apparel']");

    public String getApparelText() {
        return getTextFromElement(apparelText);
    }
}
