package StepDefinations;

import Pages.Additional_informationPage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Utility.CommonPage;


public class Additional_informationStep extends CommonPage {
    WebDriver driver;
    LoginPage loginPage;
    String exp_title="Club Swan";
    Additional_informationPage addInfo;

//    @Given("valid url with credential")
//    public void valid_url() throws InterruptedException {
//
//        //get the chromedriver from CommonPage
//        CommonPage commonPage;
//        commonPage=new CommonPage();
//        driver= commonPage.GetChromeDriver();
//
//        //get the url from BaseUrl
//        String URL= BaseUrl.BaseUrlMain();
//        driver.get(URL);
//        driver.manage().window().maximize();
//
//        loginPage=new LoginPage(driver);
//        loginPage.PageClass();
//
//        String curr_window_title = driver.getTitle();
//        Assert.assertEquals(curr_window_title, exp_title);
//        System.out.println("We are in Additional Information page");
//        Thread.sleep(5000);



  //  }

        @When("user select annual transaction volume")
        public void user_select_annual_transaction_volume () throws InterruptedException {
            addInfo = new Additional_informationPage(driver);
            Thread.sleep(3000);
            addInfo.AnnualVal();

        }
        @And("user Answer from Annual Transaction Volume dropdown")
        public void user_answer_from_annual_transaction_volume_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.Answer_01();
        }
        @Then("user selects Approximate Net worth dropdown")
        public void user_selects_approximate_net_worth_dropdown () throws InterruptedException {
            addInfo = new Additional_informationPage(driver);
            addInfo.NetWorth();
        }
        @Then("user Answer from Approximate Net worth dropdown")
        public void user_answer_from_approximate_net_worth_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.Answer_02();
        }
        @Then("user selects Employment Type  dropdown")
        public void user_selects_employment_type_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.EmpType();
        }
        @Then("user Answer from Employment Type dropdown")
        public void user_answer_from_employment_type_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.Answer_03();
        }
        @Then("user selects Account Usage dropdown")
        public void user_selects_account_usage_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.AccUsage();
        }
        @Then("user Answer from Account Usage dropdown")
        public void user_answer_from_account_usage_dropdown () {
            addInfo = new Additional_informationPage(driver);
            addInfo.Answer_04();
        }
        @Then("Lastly user hit the Continue button")
        public void lastly_user_hit_the_continue_button () {
            addInfo = new Additional_informationPage(driver);
            addInfo.Sumbit();

        }

//        @Then("user should see the Home page")
//        public void user_should_see_the_home_page () {
//
//        }



}


