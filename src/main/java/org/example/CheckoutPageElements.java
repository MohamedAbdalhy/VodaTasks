package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPageElements {
    public Select cityDropdown (WebDriver driver){
        Select cityDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div.col-md-4.col-sm-12.checkout-dropdownCity.checkoutDeleiveryOptionsPhase2EditWidth > select")));

return cityDropdown;
    }
    public Select  areaDropdown(WebDriver driver){
        Select areaDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div:nth-child(3) > select")));

        return areaDropdown;
    }
    public WebElement toMyAdderss(WebDriver driver){
        return  driver.findElement(By.cssSelector("#collapseOne > div > div.checkout-DelivaryOptions.fontReg > div.row.DelivaryOptionsMirgen.justify-content-center > div:nth-child(1) > div.checkout-DelivaryOptionsInfo.checkout-DelivaryToAddress.open.firstOpen"));
    }
    public WebElement street(WebDriver driver){
        return driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div.addressName > div > input"));
    }
    public WebElement building(WebDriver driver){
        return driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(2) > div > input"));
    }
    public WebElement floor(WebDriver driver){
        return driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(3) > div > input"));
    }
    public WebElement appartment(WebDriver driver){
        return driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(4) > div > input"));
    }
    public WebElement firstName(WebDriver driver){
        return driver.findElement(By.cssSelector("#collapseTwo > form > div > div > div.col-md-6.col-sm-12.checkout-formControl.checkout-formControl1 > div:nth-child(1) > input"));
    }


}
