package StepDefinations;

import Pages.ShoppingPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShoppingStep {
    public WebDriver driver;
    ShoppingPage shoppingPage;
    SmartWait smartWait = new SmartWait();
    public ShoppingStep(){
        this.driver= Hooks.getDriver();
        shoppingPage=new ShoppingPage(driver);
    }
    @When("user click on shopping button")
    public void user_click_on_shopping_button() throws InterruptedException {

        try {
            if (shoppingPage.IsPopup()) {
                shoppingPage.buttonCancel();
                shoppingPage.ShoppingBtn();
            }
        }
        catch(Exception e) {
            shoppingPage.ShoppingBtn();
        }

    }
    @And("user input description")
    public void user_input_description()throws InterruptedException {
      shoppingPage.DescriptionInput();
      }
    @When("user input brand name")
    public void user_input_brand_name()throws InterruptedException {
        shoppingPage.BrandInput();
    }
    @And("user input style")
    public void user_input_style()throws InterruptedException {
        shoppingPage.StyleInput();
    }
    @And("user input color")
    public void user_input_color()throws InterruptedException {
        shoppingPage.ColorInput();
    }
    @And("user input weblink")
    public void user_input_weblink()throws InterruptedException {
        shoppingPage.WebLinkInput();
    }
    @And("user hit the create request button")
    public void user_hit_the_create_request_button()throws InterruptedException {
        shoppingPage.RequestButton();
    }

    @And("user selects request and request status from search box")
    public void user_selects_request_and_request_status_from_search_box()throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        shoppingPage.searchReqClick();
        smartWait.waitUntilPageIsLoaded(5);
        shoppingPage.allReqClick();
        smartWait.waitUntilPageIsLoaded(5);
        shoppingPage.reqStatusClick();
        smartWait.waitUntilPageIsLoaded(5);
        shoppingPage.inProgressStatusClick();
    }
    @Then("user should see the shopping request status")
    public void user_should_see_the_shopping_request_status()throws InterruptedException {
        Assert.assertTrue("User should see customer list",shoppingPage.isRequestPageAvailable());
    }

}
