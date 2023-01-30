package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/T.LogOut/LogOut.feature",glue = "StepDefinations",tags = "@logout",

        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class LogoutTestRunner {
}
