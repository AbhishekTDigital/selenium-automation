package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = ".//Features/LoginFeature.feature",
    glue = "StepDefinition",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports/reports_html.html"}
)
public class Run extends AbstractTestNGCucumberTests {
    /* This class is used to run Cucumber tests with TestNG */
}
