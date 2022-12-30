package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Accounts/Accounts.feature",glue = "StepDefinations",
        tags = "@tag2",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class AccountsTestRunner {
}
//@tag1 or @tag2 or @tag3 or @tag4 or @tag5 or @tag6 or @tag7 or @tag8 or @tag9 or @tag10 or @tag11