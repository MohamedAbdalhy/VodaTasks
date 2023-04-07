package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {
    public WebElement checkout(WebDriver driver) {

return driver.findElement(By.cssSelector("body > app-root > div > app-shoping-cart > div > div.shopingCartContainer > div.shopingCartItemCont > div.shopingCartContainer-promoCode > div.shopingCartContainer-promoCode > div > div.cart_checkout.fontLightEnAr > button"));
    }
    }
