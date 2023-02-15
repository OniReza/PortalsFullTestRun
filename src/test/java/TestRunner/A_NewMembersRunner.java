package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/A.NewMembers/NewMembers.feature",glue = "StepDefinations",
        tags="@first_card_purchase or @first_card_activate_non_us_dc",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class A_NewMembersRunner {
}

/* ::::::::::::::::::::::::::::::::::::Note for tags::::::::::::::::::::::::::::::::::
1. @new_member_dc_us
 ---> popup-topup, virtual card purchase and activate using debit/credit card; m2m beneficiary creation; phy card activation scenarios for US members.
2. @new_member_dc_non_us
 ---> popup-topup, virtual card purchase and activate using debit/credit card; m2m beneficiary creation; phy card activation scenarios for US members.
3. @new_member_acc
 ---> popup-topup using debit/credit card; virtual card purchase and activate using e-Wallet; m2m beneficiary creation; phy card activation scenarios for US members.

*/
