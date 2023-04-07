package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public WebElement addToBasket(WebDriver driver){
        return   driver.findElement(By.cssSelector("body > app-root > div > app-product-details > div > div.productDetails > div > div.productDetails-paymentOptions > div > div > div.addToBasket-btn > button"));
    }


}
