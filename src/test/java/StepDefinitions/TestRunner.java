package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue={"StepDefinitions"},
plugin= {"pretty", "html:target/cucumber-html-report"}
)

public class TestRunner {

}

//plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-html-report"} 