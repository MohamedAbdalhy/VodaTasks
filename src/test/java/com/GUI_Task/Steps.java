package com.GUI_Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.BasketPage;
import org.example.HomePageElements;
import org.example.ProductList;
import org.example.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Steps {
    WebDriver driver;
    HomePageElements homePageElements;
    ProductList productList ;
    ProductPage productPage ;
    BasketPage basketPage ;
    @Given(": User open Vodafone Shop website and go to shop Page")
    public void user_open_vodafone_shop_website_and_go_to_shop_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://eshop.vodafone.com.eg/eshop/");

    }
    @Test
    @When(": user select English language")
    public void user_select_english_language() throws InterruptedException {
        //1
        driver.findElement(By.cssSelector("#profile-tab > span")).click();
        Thread.sleep(2000);
    }

    @When(": Go to Iphone via “Shop By Brand” section")
    public void go_to_via_shop_by_brand_section() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/div/app-home-page/div/app-brand/div/div/div[1]/ul/li[7]/a")).click();
        Thread.sleep(10000);
    }
    @When(": Select any of returned iphone mobiles")
    public void select_any_of_returned_iphone_mobiles() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[6]/a/div/div[3]")).click();
        Thread.sleep(3000);
    }
    @When(": Press add to cart.")
    public void press_add_to_cart() throws InterruptedException {
        driver.findElement(By.cssSelector("body > app-root > div > app-product-details > div > div.productDetails > div > div.productDetails-paymentOptions > div > div > div.addToBasket-btn > button")).click();
        Thread.sleep(3000);
    }
    @When(": Press Proceed to Checkout.")
    public void press_proceed_to_checkout() throws InterruptedException {
        driver.findElement(By.cssSelector("body > app-root > div > app-shoping-cart > div > div.shopingCartContainer > div.shopingCartItemCont > div.shopingCartContainer-promoCode > div.shopingCartContainer-promoCode > div > div.cart_checkout.fontLightEnAr > button")).click();
        Thread.sleep(3000);
    }
      @When(": Select “Delivery Options” as “Cairo” “Ain Shams”.")
    public void select_delivery_options_as_cairo_ain_shams() throws InterruptedException {
        Select cityDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div.col-md-4.col-sm-12.checkout-dropdownCity.checkoutDeleiveryOptionsPhase2EditWidth > select")));
        cityDropdown.selectByValue("0");
        Thread.sleep(3000);
        Select areaDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div:nth-child(3) > select")));
        areaDropdown.selectByIndex(4);
        Thread.sleep(3000);
    }



    @When(": Select “Deliver to My Address”.")
    public void select_deliver_to_my_address() throws InterruptedException {
        driver.findElement(By.cssSelector("#collapseOne > div > div.checkout-DelivaryOptions.fontReg > div.row.DelivaryOptionsMirgen.justify-content-center > div:nth-child(1) > div.checkout-DelivaryOptionsInfo.checkout-DelivaryToAddress.open.firstOpen")).click();
        Thread.sleep(2000);
    }

    @When(": Add address details.")
    public void add_address_details() throws InterruptedException {
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div.addressName > div > input")).sendKeys("elhay156");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(2) > div > input")).sendKeys("15");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(3) > div > input")).sendKeys("56");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(4) > div > input")).sendKeys("3");
        Thread.sleep(2000);
    }

    @When(": Press continue.")
    public void press_continue() throws InterruptedException {
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(4) > div > input")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @When(": Leave Personal info. Tab empty.")
        public void user_cant_continue_after_fill_peesonal_information () throws InterruptedException {
        driver.findElement(By.cssSelector("#collapseTwo > form > div > div > div.col-md-6.col-sm-12.checkout-formControl.checkout-formControl1 > div:nth-child(1) > input")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        }
        @Test
@Then(": Show Readable error massage from  “Full Name” field.")
    public void dsdsd (){
    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div")).isDisplayed());

}


    }

