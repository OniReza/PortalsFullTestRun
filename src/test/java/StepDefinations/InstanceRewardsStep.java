package StepDefinations;

import Pages.InstanceRewardsPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class InstanceRewardsStep{
    public WebDriver driver;
   InstanceRewardsPage instanceRewardsPage;
    SmartWait smartWait = new SmartWait();

    public InstanceRewardsStep(){
        this.driver= Hooks.getDriver();
        instanceRewardsPage=new InstanceRewardsPage(driver);
    }

    @When("user click on instance rewards options")
    public void user_click_instance_option() throws InterruptedException {

        try {
            if (instanceRewardsPage.IsPopup()) {
                instanceRewardsPage.buttonCancel();
                instanceRewardsPage.ClickInstanceBtn();
            }
        }
        catch(Exception e) {
            instanceRewardsPage.ClickInstanceBtn();
        }

    }
    @And("user will choose card from card option")
    public void user_select_card_for_reward()throws InterruptedException {
        instanceRewardsPage.SelectCard();
        //smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user will click select button from the card list")
    public void user_will_click_select_button(){
        instanceRewardsPage.selectCardFromList();
        //smartWait.waitUntilPageIsLoaded(5);
     }
    @Then("user should see the payment method page")
    public void user_should_see_the_booking_page(){
        Assert.assertTrue("User should see customer list", instanceRewardsPage.isPaymentMethodAvailable());
       // smartWait.waitUntilPageIsLoaded(5);
    }
    @When("user in the payment methode")
    public void user_in_the_payment_methode()throws InterruptedException {
        user_click_instance_option();
        user_select_card_for_reward();
        user_will_click_select_button();
       // smartWait.waitUntilPageIsLoaded(5);
        user_should_see_the_booking_page();
       // smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user input some text if need")
    public void user_input_some_text(){
     instanceRewardsPage.msgBox();
    // smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user select wallet from wallet list")
    public void user_select_wallet() throws InterruptedException{
        instanceRewardsPage.btnWallet();
      //  smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user click on redeem button")
    public void user_click_on_redeem_button() throws InterruptedException{
        instanceRewardsPage.clickRedeemBtn();
       // smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user click on see order button")
    public void user_click_on_order_button() throws InterruptedException{
        instanceRewardsPage.clickOrderBtn();
       // smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should see the order successful page")
    public void user_should_see_payment_success_page(){
        Assert.assertTrue("User should see customer list", instanceRewardsPage.isPaymentMethodSuccessfully());
       // smartWait.waitUntilPageIsLoaded(5);

    }

    @When("user in successful rewards page")
    public void user_in_successful_rewards_page()throws InterruptedException {

        user_click_instance_option();
       // smartWait.waitUntilPageIsLoaded(5);
        user_select_card_for_reward();
        //smartWait.waitUntilPageIsLoaded(5);
        user_will_click_select_button();
       // smartWait.waitUntilPageIsLoaded(5);
        user_should_see_the_booking_page();
       // smartWait.waitUntilPageIsLoaded(5);
        user_input_some_text();
        //smartWait.waitUntilPageIsLoaded(5);
        user_select_wallet();
       // smartWait.waitUntilPageIsLoaded(5);
        user_click_on_redeem_button();
       // smartWait.waitUntilPageIsLoaded(5);
        user_click_on_order_button();
      //  smartWait.waitUntilPageIsLoaded(5);
        user_should_see_payment_success_page();
    }
    @And("user click on close button")
    public void user_click_on_close_button(){
        instanceRewardsPage.closeBtn();
       // smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user click on your rewards tab")
    public void user_click_on_your_rewards_tab(){
        instanceRewardsPage.tabsRewards();
        //smartWait.waitUntilPageIsLoaded(5);
    }
    @Then("user should see his reward cards")
    public void user_should_see_his_reward_cards(){
        Assert.assertTrue("User should see customer list", instanceRewardsPage.isRewardsSuccessfully());
        //smartWait.waitUntilPageIsLoaded(5);
    }

}
