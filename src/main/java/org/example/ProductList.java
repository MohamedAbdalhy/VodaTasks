package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductList {
    public WebElement ipad(WebDriver driver){
        return   driver.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[6]/a/div/div[3]"));
    }
}
