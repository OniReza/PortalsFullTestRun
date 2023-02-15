package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Cards/Cards.feature",glue = "StepDefinations",
        tags = " @cs_card_topup_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Cards_Test_Runner {
}


/*::::::::::::::::::::::::::::::::::::Note for tags::::::::::::::::::::::::::::::::::
*** @all_card_features   ---> All card (both physical and virtual) features will run by this tag
*** @all_Vcard_features   ---> Only all  Virtual card features will run by this tag

1.@all_phy_card_feature      ----> All physical card's feature(US and Non-US) will run by this tag.
2.@all_first_Vcard_feature   ----> All first virtual card's feature(US and Non-US) will run by this tag.
3.@all_second_Vcard_feature  ----> All second virtual card's feature(US and Non-US) will run by this tag.
4.@all_third_Vcard_feature   ----> All third virtual card's feature(US and Non-US) will run by this tag.



For only ClubSwan below tags need to run for card topup
1. @cs_card_topup_us    ---> All card (both physical and virtual) topup feature for Club Swan US members only.
2.@cs_card_topup_non_us    ---> All card (both physical and virtual) topup feature for Club Swan Non-US members only.


 */