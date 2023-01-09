package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "StepDefinations",
        tags = "@USD_common or  @USD_non_us  or  @EURO_common or  @EURO_non_us or @GBP_common or @GBP_non_us or @JPY_common or @JPY_non_us or @CNY_common or  @CNY_non_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true)


public class FullTestRunner {
}
