package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "StepDefinations",plugin = "html:target/cucumber/fullTest.html",
        monochrome = true)


public class FullTestRunner {
}
