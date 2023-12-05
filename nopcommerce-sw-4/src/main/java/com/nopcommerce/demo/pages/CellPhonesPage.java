package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    By listView = By.xpath("//a[normalize-space()='List']");
    By productName = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    //2.4 Click on List View Tab
    public void clickListView() {
        clickOnElement(listView);
    }

    //2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnProductName() {
        clickOnElement(productName);
    }

}
