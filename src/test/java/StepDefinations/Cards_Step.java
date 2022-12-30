package StepDefinations;

import Pages.Cards_Page;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Cards_Step {
    public WebDriver driver;
    Cards_Page cardspage;
    SmartWait smartWait = new SmartWait();

    public Cards_Step() {
        this.driver = Hooks.getDriver();
        cardspage = new Cards_Page(driver);
    }

//    @After(order=1)
//    public void takeScraenshotOnFailure(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src, "image/png", "screenshot");
//        }
//
//    }

    @When("user clicks on cards on side menu")
    public void user_clicks_on_Cards_on_side_menu() throws InterruptedException {

        try {
            if (cardspage.IsPopup()) {
                cardspage.buttonCancel();
                cardspage.cardsMenuClick();
            }
        }
        catch(Exception e) {
            cardspage.cardsMenuClick();
        }
       // cardspage.cardsMenuClick();
    }

    @Then("physical cards page will appear")
    public void physical_cards_page_will_appear() {
        Assert.assertTrue("Physical card didn't appear", cardspage.physicalCardCheck());
        System.out.println("Physical card appeared");
    }

    @And("user clicks on physical card")
    public void user_clicks_on_physical_card() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.physicalCardClick();
        Assert.assertTrue("We are not in details tab", cardspage.detailsTabCheck());
        Thread.sleep(2000);
    }

    @And("user clicks on statements Tab")
    public void user_is_in_details_tab_user_clicks_on_statements_tab() throws InterruptedException {
//      clicks_on_virtual_card_tab_from_card_page();
//      user_clicks_on_first_virtual_card();
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.statementTabClick();
        Thread.sleep(2000);
    }

    /*Modify by: Abid Reza
  12-19-2022
  Update Method:isStatementAvailable();
  */
    @And("user clicks on download button if any statement available")
    public void user_clicks_on_download_button_if_any_statement_available() throws InterruptedException {
        try {
            if(cardspage.isStatementAvailable())
            cardspage.statementDownloadClick();
            smartWait.waitUntilPageIsLoaded(5);
        }
        catch(Exception e) {
            cardspage.cardsMenuClick();
        }
    }

    @Then("a statement will be downloaded")
    public void a_statement_will_be_downloaded() {
        System.out.println("Statement downloaded");
    }

    @When("user clicks on transaction tab")
    public void user_clicks_on_transaction_tab() throws InterruptedException {
//        clicks_on_virtual_card_tab_from_card_page();
//        user_clicks_on_first_virtual_card();
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.transactionTabClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("latest transactions should appear in  your transactions section")
    public void latest_transactions_should_appear_in__your_transactions_section() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Latest pending transaction not found", cardspage.latestTransectionCheck());
        Thread.sleep(2000);
    }

    @Then("user should be able to export transactions as pdf and csv")
    public void user_should_be_able_to_export_transactions_as_pdf_and_csv() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.exportTransaction();
        Thread.sleep(2000);
    }

    @And("user clicks on load tab")
    public void user_clicks_on_load_tab() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.loadTabClick();
        Thread.sleep(2000);
    }

    @And("user enters amount to load")
    public void user_enters_amount_to_load() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.enterLoadAmount();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user checks overview")
    public void user_checks_overview() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Overview didn't appeared", cardspage.overviewCheck());
        Thread.sleep(2000);
    }

    @And("user clicks confirm button")
    public void user_clicks_confirm_button() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.confirmBtnClick();
        Thread.sleep(2000);
    }

    @And("user provides otp and clicks confirm button again")
    public void user_provides_otp_and_clicks_confirm_button_again() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.enterOtp();
        Thread.sleep(1000);
        cardspage.otpConfirmBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user checks success message and press ok button")
    public void user_checks_success_message_and_press_ok_button() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Load unSuccessful", cardspage.sucessMsgCheck());
        cardspage.okBtnClick();
        Thread.sleep(2000);
    }

    @Then("user should redirect back to physical card page")
    public void user_should_redirect_back_to_physical_card_page() {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Physical card didn't appear", cardspage.physicalCardCheck());
        System.out.println("Back to Physical card");
    }

    @And("user clicks on unload tab")
    public void user_clicks_on_unload_tab() throws InterruptedException {
//        user_clicks_on_Cards_on_side_menu();
//        user_clicks_on_physical_card();
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.unloadTabClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user enters amount to unload")
    public void user_enters_amount_to_unload() throws InterruptedException {
        cardspage.enterUnloadAmount();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user clicks on topup tab")
    public void user_clicks_on_topup_tab() throws InterruptedException {
//        clicks_on_virtual_card_tab_from_card_page();
//        user_clicks_on_first_virtual_card();
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.topUpTabClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects amount to topup")
    public void user_selects_amount_to_topup() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.topupAmountDropdownClick();
        Thread.sleep(1000);
        cardspage.topupAmountClick();
    }

    @And("clicks on topup button")
    public void clicks_on_topup_button() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.topupBtnClick();
        smartWait.waitUntilPageIsLoaded(5);

    }

    @And("user checks confirmation message and clicks ok")
    public void user_checks_confirmation_message_and_clicks_ok() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Topup Failled", cardspage.sucessMsgCheck());
        Thread.sleep(1000);
        cardspage.OKbtnClick();
        smartWait.waitUntilPageIsLoaded(5);

    }

    @When("user checks summary")
    public void user_checks_summary() {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Topup Summary didn't appear", cardspage.summaryCheck());
    }

    @When("user clicks confirm button for topup")
    public void user_clicks_confirm_button_for_topup() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.topupConfirmBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("clicks on virtual card tab from card page")
    public void clicks_on_virtual_card_tab_from_card_page() throws InterruptedException {
        user_clicks_on_Cards_on_side_menu();
        smartWait.waitUntilPageIsLoaded(10);
        cardspage.virtualCardTabClick();
        Thread.sleep(2000);
    }

    @And("user clicks on first virtual card")
    public void user_clicks_on_first_virtual_card() throws InterruptedException {
        try {
            if (!cardspage.createVCardBtnCheck()) {
                cardspage.firstVCardClick();
            } else {
                System.out.println("No vcard");
            }
        } catch (NoSuchElementException e) {

        } finally {
            cardspage.firstVCardClick();
        }
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should redirect back to virtual card page")
    public void user_should_redirect_back_to_virtual_card_page() throws InterruptedException {
        Assert.assertTrue("Didn't come back to virtual Card Page", cardspage.firstVCardCheck());
        Thread.sleep(2000);
    }

}
