package com.software.tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/", 
    glue = "com.software.steps",              
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
//// gais's branch 