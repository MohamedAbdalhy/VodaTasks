package com.GUI_Task;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/GUI_Task/checkout.feature",
                 plugin = {"pretty","html:target/Test-report.html"})
public class Runner {
}
