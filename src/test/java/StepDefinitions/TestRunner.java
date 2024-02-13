package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports/Results.html",
                "json:target/HTMLReports/Results.json",
                "junit:target/HTMLReports/Results.xml"},
        tags = "@Re-Testing")
public class TestRunner {
}