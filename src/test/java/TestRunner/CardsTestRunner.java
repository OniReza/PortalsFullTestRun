package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Cards/Cards.feature",glue = "StepDefinations",
        tags = "@pin1",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CardsTestRunner {
}
