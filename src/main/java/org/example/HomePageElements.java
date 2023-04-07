package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    public WebElement language(WebDriver driver){
        return driver.findElement(By.cssSelector("#profile-tab > span"));
    }
    public WebElement appleCard(WebDriver driver){
        return driver.findElement(By.xpath("/html/body/app-root/div/app-home-page/div/app-brand/div/div/div[1]/ul/li[7]/a"));

    }

}
