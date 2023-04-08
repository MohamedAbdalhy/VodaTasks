package com.GUI_Task;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver ;
    @After
    public void beforeScenario (){
        driver.quit();
    }
}
