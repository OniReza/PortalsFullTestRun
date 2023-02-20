package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Accounts/Accounts.feature",glue = "StepDefinations",
        tags="@card_deposit_usd_non_us or @card_deposit_euro_non_us or @card_deposit_gbp_non_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Accounts_Test_Runner {
}

/*::::::::::::::::::::::::::::::::::::Note for tags::::::::::::::::::::::::::::::::::

1. @usd_all_features_us      ---> For all USD wallet features for US Members
2. @usd_all_features_non_us  ---> For all USD wallet features for Non-US Members

3. @euro_all_features_us      ---> For all Euro wallet features for US Members
4. @euro_all_features_non_us  ---> For all Euro wallet features for Non-US Members

5. @gbp_all_features_us      ---> For all GBP wallet features for US Members
6. @gbp_all_features_non_us  ---> For all GBP wallet features for Non-US Members

7. @jpy_all_features_us      ---> For all JPY wallet features for US Members
8. @jpy_all_features_non_us  ---> For all JPY wallet features for Non-US Members

9. @cny_all_features_us      ---> For all CNY wallet features for US Members
10. @cny_all_features_non_us  ---> For all CNY wallet features for Non-US Members


 */








