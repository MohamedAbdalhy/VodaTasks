package com.GUI_Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Steps {
    WebDriver driver;
    @AfterTest
    @Given(": User open Vodafone Shop website and go to shop Page")
    public void user_open_vodafone_shop_website_and_go_to_shop_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://eshop.vodafone.com.eg/eshop/");
    }
    @Test
    @When(": user select English language")
    public void user_select_english_language() {
driver.findElement(By.cssSelector("#profile-tab > span")).click();
    }

    @When("Go to {string} via “Shop By Brand” section")
    public void go_to_via_shop_by_brand_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Select any of returned iphone mobiles")
    public void select_any_of_returned_iphone_mobiles() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Press add to cart.")
    public void press_add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Press Proceed to Checkout.")
    public void press_proceed_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select “Delivery Options” as “Cairo” “Ain Shams”.")
    public void select_delivery_options_as_cairo_ain_shams() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select “Deliver to My Address”.")
    public void select_deliver_to_my_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Add address details.")
    public void add_address_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Press continue.")
    public void press_continue() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Leave Personal info. Tab empty.")
    public void leave_personal_info_tab_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Cant continue After fill Peesonal information.")
    public void user_cant_continue_after_fill_peesonal_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Show Readable error massage from  “Full Name” field.")
    public void show_readable_error_massage_from_full_name_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
