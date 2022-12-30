package StepDefinations;

import Pages.PaymentGatewayPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentGatewayStep {
    public WebDriver driver;
    PaymentGatewayPage paymentpage;

    SmartWait smartWait = new SmartWait();

    public PaymentGatewayStep() {
        this.driver = Hooks.getDriver();
        paymentpage = new PaymentGatewayPage(driver);
    }
    @And("enter card details in payment information")
    public void enter_card_details_in_payment_information() throws InterruptedException {
        if (paymentpage.apexFrameCheck() ||!paymentpage.stripeFrameCheck() ) {
            driver.switchTo().frame("apex-frame");
            Thread.sleep(2000);
            paymentpage.enterApxxCardNum();
            paymentpage.enterApxxMonth();
            paymentpage.enterApxxCardYear();
            paymentpage.enterApexxCvv();
            Thread.sleep(2000);
            paymentpage.clickApxxPay();
            String windowHandle = driver.getWindowHandle(); //save the original window handle
            driver.switchTo().window(windowHandle);
            smartWait.waitUntilPageIsLoaded(5);

        } else if (paymentpage.stripeFrameCheck() || !paymentpage.apexFrameCheck() ) {
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'__privateStripeFrame')]")));
            paymentpage.enterStripeCardNum();
            paymentpage.enterStripeExpdate();
            paymentpage.enterStripeCvc();
            Thread.sleep(2000);
            String windowHandle = driver.getWindowHandle(); // save the original window handle
            driver.switchTo().window(windowHandle);
            Thread.sleep(1000);
            paymentpage.stripePayClick();
            Thread.sleep(2000);
            smartWait.waitUntilPageIsLoaded(5);

        } else {
            System.out.println("No payment gateway");

        }
    }
}