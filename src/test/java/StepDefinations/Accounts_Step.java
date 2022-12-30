package StepDefinations;

import Pages.Accounts_Page;
import Pages.LoginPage;
import Utility.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Accounts_Step {
    public  WebDriver driver;
    Accounts_Page accpage;
    SmartWait smartWait = new SmartWait();

    public Accounts_Step(){
        this.driver= Hooks.getDriver();
        accpage= new Accounts_Page(driver);

    }

    //Details Tab
    @When("user clicks on account button")
    public void user_clicks_on_account() throws InterruptedException {

        try {
            if (accpage.IsPopup()) {
                accpage.buttonCancel();
                accpage.accMenuClick();
            }
        }
        catch(Exception e) {
            accpage.accMenuClick();
        }
        smartWait.waitUntilPageIsLoaded(1);
    }

    @And("user clicks on first wallet")
    public void user_clicks_on_usd_wallet() throws InterruptedException {
        accpage.walletClick();
        System.out.println("USD Wallet Clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }

    @Then("user should see a graph")
    public void user_should_see_a_graph() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("Graph is not Displayed", accpage.checkgraph());
        System.out.println("Graph is not Displayed");
    }
    //Move Feature
    @And("user clicks on move tab")
    public void user_clicks_on_move_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        System.out.println("User is in USD Wallet");
        accpage.moveTabClick();
        System.out.println("Move Page clicked");
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("user clicks on select beneficiary dropdown")
    public void user_clicks_on_select_beneficiary_dropdown() throws InterruptedException {
        accpage.benDropdownClick();
        System.out.println("Select Beneficiary Dropdown expended ");
        Thread.sleep(50);
    }

    @And("user selects beneficiary")
    public void user_selects_beneficiary() throws InterruptedException {
        accpage.beneficiaryCLick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("user selects EUR wallet")
    public void user_selects_eur_wallet() throws InterruptedException {
        accpage.euroAccClcik();
        System.out.println("Euro Account Selected");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @When("enter amount on sending amount box")
    public void enter_amount_on_sending_amount_in_usd() throws InterruptedException {
        accpage.enterSendingAmount();
        System.out.println("Amount Entered");
        smartWait.waitUntilPageIsLoaded(1);
    }

    @When("user clicks confirm")
    public void user_clicks_confirm() throws InterruptedException {
        accpage.confirmBtnClick();
        System.out.println("Confirm Button Clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }

    @And("user enters secret code")
    public void user_enters_secret_code() throws InterruptedException {
        accpage.enterSecretCode();
        Thread.sleep(50);
    }

    @And("user clicks confirm again")
    public void user_clicks_confirm_again() throws InterruptedException {
        accpage.confirmBtnClick();
        System.out.println("Confirm Button Clicked again");
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("transfer successfully completed message is shown")
    public void transfer_successfully_completed_message_is_shown() throws InterruptedException {
        Assert.assertTrue("Transfer Unsuccessful.", accpage.checkSuccessMsg());
        System.out.println("Transfer Done");
        Thread.sleep(1000);
    }

    @And("user clicks on ok")
    public void user_clicks_on_ok() throws InterruptedException {
        accpage.okBtnClick();
        System.out.println("Clicked on OK");
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should redirect to USD wallet details tab")
    public void user_should_redirect_to_usd_wallet_details_tab() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("User is not in Details Tab", accpage.checkDetailsTab());
        Thread.sleep(1000);
        System.out.println("User is in Details Tab");
        Thread.sleep(2000);
    }
    // Deposit Feature
    @And("user clicks on deposit")
    public void user_clicks_on_deposit() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.depositTabClick();
        System.out.println("Deposit clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }

    @And("user expend from dropdown")
    public void user_expend_from_dropdown() throws InterruptedException {
        accpage.fromDropdwnClick();
        System.out.println("From dropdown Expended");
        Thread.sleep(500);
    }

    @And("user selects debit or credit card")
    public void user_selects_debit_or_credit_card() throws InterruptedException {
        accpage.debitCardClick();
        smartWait.waitUntilPageIsLoaded(1);
    }

    @And("user enters amount to load in USD")
    public void user_enters_amount_to_load_in_usd() throws InterruptedException {
        accpage.enterloadAmount();
        System.out.println("Load amount Entered");
        Thread.sleep(500);
    }

    @And("user clicks agreement")
    public void user_clicks_agreement() throws InterruptedException {
        accpage.aggrementClick();
        System.out.println("Agreed transfer Aggrement");

       // smartWait.waitUntilPageIsLoaded(5);
    }

    @And("summary should appear")
    public void user_checks_summary() throws InterruptedException {
        accpage.checkSummary();
        System.out.println("Summary appeared");
        smartWait.waitUntilPageIsLoaded(5);


    }
    @And("expedite fee should add in summary")
    public void expedite_fee_should_add_in_summary() throws InterruptedException {
        accpage=new Accounts_Page(driver);
        smartWait.waitUntilPageIsLoaded(5);
        Thread.sleep(1000);
        Assert.assertTrue("Expedite fee didn't added in summary",accpage.checkExpeditSummary());
    }
    @And("clicks confirm")
    public void clicks_confirm() throws InterruptedException {
        accpage.confirmBtnClick();
        System.out.println("Confirm button clicked");
        smartWait.waitUntilPageIsLoaded(1);


    }

    /*Modify by: Abid Reza
      12-20-2022
      Update Method:isLoadUnSuccessMsg();
     */
    @And("user checks confirmation message")
    public void user_checks_confirmation_message() throws InterruptedException {

        Assert.assertTrue("Deposit Unsuccessfull", accpage.checkLoadSuccessMsg());
        System.out.println("Deposit Successful");
        smartWait.waitUntilPageIsLoaded(10);

//        if(accpage.isLoadUnSuccessMsg()) {
//           System.out.println("transaction cannot be completed");
//            smartWait.waitUntilPageIsLoaded(10);
//          // accpage.btnOkay();
//        }
//        else
//        {
//            Assert.assertTrue("Deposit Unsuccessfull", accpage.checkLoadSuccessMsg());
//            System.out.println("Deposit Successful");
//            smartWait.waitUntilPageIsLoaded(1);
//        }
    }
    @And("user clicks ok")
    public void user_clicks_ok() throws InterruptedException {
        accpage.clickOKbtn();
        System.out.println("Ok Button Clicked");
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should redirect to accounts")
    public void user_should_redirect_to_accounts() throws InterruptedException {
        Assert.assertTrue("Didn't redirected to Accounts Tab", accpage.checkAccountsTab());
        System.out.println("Redirected to Accounts");
        smartWait.waitUntilPageIsLoaded(5);
    }

    // Deposit local us bank
    @And("user selects local\\(US Bank)")
    public void user_selects_local_us_bank() {
        accpage.localUSBankClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should see details of bank")
    public void user_should_see_details_of_bank() throws InterruptedException {
        Assert.assertTrue("Local US Bank details didn't appears", accpage.localUSBankBeneficiaryCheck());
        smartWait.waitUntilPageIsLoaded(5);
        System.out.println("Local US Bank details appeared");
    }
    // Crypto Deposit
    @When("user selects crypto deposit")
    public void user_selects_crypto_deposit() throws InterruptedException {
        accpage.cryptoClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("user enters sending amount in TBTC")
    public void user_enters_sending_amount_in_tbtc() throws InterruptedException {
        accpage.enterCryptoSendAmount();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @When("user clicks on terms and condition check box")
    public void user_clicks_on_terms_and_condition_check_box() throws InterruptedException {
        accpage.checkBoxClick();
        Thread.sleep(1000);
    }

    @Then("user should see a summary")
    public void user_should_see_a_summary() throws InterruptedException {
        Assert.assertTrue("Crypto Deposit Summary didn't appears", accpage.cryptoSummaryCheck());
        smartWait.waitUntilPageIsLoaded(5);
    }

// Transfer to new member
    @And("user clicks on transfer to a member pay")
    public void user_clicks_on_pay() throws InterruptedException {
        accpage.memberPayBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects existing beneficiary")
    public void user_clicks_transfer_to_another_member_wallet() throws InterruptedException {
        accpage.benDropdownClick();
        Thread.sleep(50);
        accpage.beneficiarySelect();
        smartWait.waitUntilPageIsLoaded(5);
        System.out.println("Transfer Beneficiary Selected");
    }

    @And("user enters sending amount in USD and payment reference")
    public void user_enters_wallet_number_and_reference_name() throws InterruptedException {
        accpage.enterSendingAmount();
        accpage.enterPaymentRef();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user checks summary of transfer amount")
    public void user_checks_summary_of_transfer_amount() throws InterruptedException {
        accpage.checkTransferSummary();
        Thread.sleep(500);
    }

    @And("clicks confirm button")
    public void clicks_confirm_button() throws InterruptedException {
        clicks_confirm();
    }

    @And("enter otp for transfer")
    public void enter_otp_for_transfer() throws InterruptedException {
        accpage.enterSecretCode();
        Thread.sleep(50);
    }

    @And("user clicks confirm button again")
    public void user_clicks_confirm_button_again() throws InterruptedException {
        clicks_confirm_button();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user checks success message")
    public void user_checks_success_message() throws InterruptedException {
        Assert.assertTrue("Transfer Not Successful", accpage.checkSuccessMsg());
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("press ok")
    public void press_ok() throws InterruptedException {
        user_clicks_ok();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user should redirect to details")
    public void user_should_redirect_to_details() throws InterruptedException {
        user_should_see_a_graph();
        smartWait.waitUntilPageIsLoaded(5);
    }
    // Make payment to new individual
    @When("user clicks payments tab")
    public void user_clicks_payments_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.paymentTabClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("clicks on make payment pay button")
    public void clicks_on_make_payment_pay_button() throws InterruptedException {
        accpage.makePaymentClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user clicks on individual")
    public void user_clicks_on_individual() {
        accpage.toIndividual();
    }

    @And("user clicks on new")
    public void user_clicks_on_new() throws InterruptedException {
        accpage.newBtnClick();
    }

    @And("user enters other recipient details for new individual")
    public void user_enters_other_recipient_details_for_new_individual() throws InterruptedException {
        accpage.recipientDetails();
    }

    @And("user enters bank details")
    public void user_enters_bank_details() throws InterruptedException {
        accpage.bankDetails();
    }

    @And("user enters amount")
    public void user_enters_amount() throws InterruptedException {
        accpage.amount();
        Thread.sleep(2000);
    }

    @And("user selects timing\\(now)")
    public void user_selects_when_now() {
        accpage.whenToPay();
    }

    @And("user enter references")
    public void user_enter_references() throws InterruptedException {
        accpage.references();
        Thread.sleep(1000);
    }

    @And("user clicks on pay for payment")
    public void user_clicks_on_pay_for_payment() throws InterruptedException {
        accpage.payClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("check request success message and press ok")
    public void check_success_message_and_press_ok() throws InterruptedException {
        Assert.assertTrue("Success message didn't appear", accpage.checkReqAcceptMsg());
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("if payment is complete user should redirect to payments tab")
    public void user_should_redirect_to_payments_tab() throws InterruptedException {
        Assert.assertTrue("User redirected to payment page", accpage.paymentPage());
        Thread.sleep(2000);
    }
    // Make payment to new individual ends

    // Make payment to new Business
    @When("user clicks on business")
    public void user_clicks_on_Business() throws InterruptedException {
        accpage.businessClick();
        Thread.sleep(1000);
    }

    @And("user enters other recipient details for new business")
    public void user_enters_other_recipient_details_for_new_business() throws InterruptedException {
        accpage.recipientBusinessDetails();
    }

    // Make payment to Existing Individual

    @And("user clicks on existing")
    public void user_clicks_on_Existing_Individual() throws InterruptedException {
        accpage.clickExisting();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects existing recipient from recipient details")
    public void user_selects_existing_beneficiary_from_recipient_details() {
        accpage.selectRecipients();
    }

    //Make payment to Existing Business
    @When("user is in payments tab and makes payment for existing business")
    public void user_is_in_payments_tab_and_makes_payment_for_existing_business() throws InterruptedException {
        clicks_on_make_payment_pay_button();

    }

    @And("user clicks on existing business")
    public void user_clicks_on_existing_business() throws InterruptedException {
        accpage.businessClick();
        Thread.sleep(1000);
        accpage.clickExisting();
        Thread.sleep(2000);
    }

    //Transaction Tab
    @When("user is in transaction tab")
    public void user_is_in_transaction_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.transactionsTabClick();
        smartWait.waitUntilPageIsLoaded(5);

    }

    @When("user should see latest pending transactions first\\(if any) in PENDING TRANSACTIONS")
    public void user_should_see_latest_pending_transactions_first_if_any_in_pending_transactions() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("Latest pending transaction not found", accpage.pendingTransection());
        Thread.sleep(2000);

    }

    @When("user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS")
    public void user_after_scroll_down_should_see_latest_cleared_transaction_first_in_your_transactions() throws InterruptedException {
        Assert.assertTrue("Latest Completed transaction not found", accpage.completedTransection());
        Thread.sleep(2000);
    }

    @When("user is in statements tab")
    public void user_is_in_statements_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.statementsTabBtnClick();

    }
    @And("if any statement available user clicks on download button")
    public void if_any_statement_available_user_clicks_on_download_button(){
        if (!accpage.downloadBtnCheck()) {
            System.out.println("No downloadable statement available");
        } else {
            accpage.downloadBtnClick();
            smartWait.waitUntilPageIsLoaded(5);
        }
    }
    @Then("statement should be downloaded")
    public void statement_should_be_downloaded(){
        System.out.println("Statement downloaded");
    }

    // Withdraw
    @When("user is in withdraw tab")
    public void user_is_in_withdraw_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.withdrawTabClick();
        smartWait.waitUntilPageIsLoaded(5);

    }
    @And("user add personal account")
     public void user_add_personal_account() throws InterruptedException {
        accpage.addPersonalAccClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user selects destination bank country and currency")
    public void user_selects_destination_bank_country() throws InterruptedException {
        accpage.destinationBankCountry();
        Thread.sleep(500);
        accpage.beneficiaryCurrencyClick();
        Thread.sleep(500);
        accpage.nextBtnClick();
    }

    @And("press next button")
    public void press_next_button() throws InterruptedException {
        accpage.nextBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user input withdraw beneficiary details and press next")
    public void user_enter_withdraw_beneficiary_details_and_press_next() throws InterruptedException {
        accpage.withdrawBeneficiaryDetails();
        Thread.sleep(1000);
        accpage.nextBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("input sending amount in usd")
    public void input_sending_amount_in_usd() throws InterruptedException {
        accpage.enterSendingAmount();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("click on expedite fee and outbound transfer agreement")
    public void click_on_expedite_fee_and_outbound_transfer_agreement() throws InterruptedException {
        accpage.withdrawCheckBox();
        Thread.sleep(2000);

    }
    //Pay Family
    @When("user is in pay tab")
    public void user_is_in_pay_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        accpage.payTabClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user clicks pay button of friends or family")
    public void user_clicks_pay_button_of_friends_or_family() throws InterruptedException {
        accpage.ffPayBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user clicks on pay someone new")
    public void user_clicks_on_pay_someone_new() throws InterruptedException {
        accpage.paySomeoneNewBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user input pay\\(individual) beneficiary details and press next")
    public void user_input_pay_individual_beneficiary_details_and_press_next() throws InterruptedException {
        accpage.payFriendorFamilyDetails();
        Thread.sleep(1000);
        accpage.nextBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("input payment reference and reason")
    public void input_payment_reference_and_reason() throws InterruptedException {
        accpage.paymentReason();
        Thread.sleep(500);
        accpage.paymentRef();
    }
//Pay business
    @And("user clicks pay button a business or invoice")
    public void user_clicks_pay_button_a_business_or_invoice() throws InterruptedException {
        accpage.businessPayBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user clicks on pay to new business button")
    public void user_clicks_on_pay_to_new_business_button() throws InterruptedException {
        accpage.payNewBusinessClick();
        Thread.sleep(2000);
    }
    @And("user input business beneficiary details and press next")
    public void user_input_business_beneficiary_details_and_press_next() throws InterruptedException {
        accpage.payBusinessDetails();
        smartWait.waitUntilPageIsLoaded(5);
        accpage.nextBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    //Another member pay

    @And("user clicks pay button of another member")
    public void user_clicks_pay_button_of_another_member() throws InterruptedException {
        accpage.anotherMemberPayBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("input payment reference")
    public void input_payment_reference() throws InterruptedException {
        accpage.paymentReason();
        Thread.sleep(500);
    }

}
