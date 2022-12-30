package StepDefinations;

import Pages.LoginPage;
import Utility.*;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Utility.Hooks.getDriver;

public class LoginStep {
    public WebDriver driver;
    LoginPage loginPage;
    SmartWait smartWait = new SmartWait();
    PaymentGatewayStep paymentGatewayStep;
    public LoginStep()
    {
        this.driver= getDriver();
        loginPage=new LoginPage(driver);
    }

    @After(order=1)
    public void takeScraenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

    }
    /*Modify by: Abid Reza
     12-20-2022

    */
    @Given("a valid url")
    public void a_valid_url() throws InterruptedException {

        String URL= BaseData.BaseUrlMain();
        String PURL=BaseData.BasePopUpUrl();
        driver.get(PURL);
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println("Valid Url Is Given");
        smartWait.waitUntilPageIsLoaded(5);
        loginPage.PageClass();
        Thread.sleep(2000);
        if (driver.getCurrentUrl().contains("risk")) {
            System.out.println("in add");
            addtionalInformation();
            Thread.sleep(20000);
            if (driver.getCurrentUrl().contains("lock-account")) {
                System.out.println("In recurring after risk");
                reSubByWallet();
                //reSubByCard();
                Thread.sleep(20000);
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            }
        } else if (driver.getCurrentUrl().contains("lock-account")) {
            System.out.println("Direct In recurring");
            reSubByWallet();
            //reSubByCard();
            Thread.sleep(10000);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
        smartWait.waitUntilPageIsLoaded(5);
        System.out.println("In Dashboard");
        Assert.assertTrue("Dashboard didn't appeared", loginPage.dashBoardCheck());
    }

    //Additional information page
    public void addtionalInformation() throws InterruptedException {
        if (loginPage.questionCount() == 2) {
            loginPage.risk1();
            loginPage.risk2();
        } else if (loginPage.questionCount() == 3) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
        } else if (loginPage.questionCount() == 4) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
        } else if (loginPage.questionCount() == 5) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
        } else if (loginPage.questionCount() == 6) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
            loginPage.risk6();
        } else if (loginPage.questionCount() == 7) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
            loginPage.risk6();
            loginPage.risk7();
        } else if (loginPage.questionCount() == 8) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
            loginPage.risk6();
            loginPage.risk7();
            loginPage.risk8();
        } else if (loginPage.questionCount() == 9) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
            loginPage.risk6();
            loginPage.risk7();
            loginPage.risk8();
            loginPage.risk9();
        } else if (loginPage.questionCount() == 10) {
            loginPage.risk1();
            loginPage.risk2();
            loginPage.risk3();
            loginPage.risk4();
            loginPage.risk5();
            loginPage.risk6();
            loginPage.risk7();
            loginPage.risk8();
            loginPage.risk9();
            loginPage.risk10();
        }
        loginPage.continueBtnClick();

    }

    //Resub Using Wallet
    public void reSubByWallet() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Recurring pay");
        Assert.assertTrue("Account suspended page appeared", loginPage.makePaymentChcek());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(1000);
        loginPage.Payment();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.payByWallet();
        Assert.assertTrue("Waiting page not appeared", loginPage.loadingCheck());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("Recurring pay Complete");

    }

    //Resub using Card
    public void reSubByCard() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Recurring pay");
        Assert.assertTrue("Account suspended page appeared", loginPage.makePaymentChcek());
        Thread.sleep(1000);
        loginPage.Payment();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        loginPage.payByCard();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("before APex");
        paymentGatewayStep = new PaymentGatewayStep();
        paymentGatewayStep.enter_card_details_in_payment_information();

    }
}










