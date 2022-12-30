package StepDefinations;


import Pages.TravelPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class TravelStep{

    public WebDriver driver;
    TravelPage travelPage;
   SmartWait smartWait = new SmartWait();

    public TravelStep()
    {
        this.driver= Hooks.getDriver();
        travelPage=new TravelPage(driver);

    }

    @When("user click travel option")
    public void user_click_travel_option(){

        try {
            if (travelPage.IsPopup()) {
                travelPage.buttonCancel();
                travelPage.userClickOnTravel();
            }
        }
        catch(Exception e) {
            travelPage.userClickOnTravel();
        }

        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user select person option")
    public void user_select_person_option(){
        travelPage.userClickPersonList();
        travelPage.userClickPersonOption();
    }

    @And("user select location")
    public void user_select_location(){
        travelPage.userClickLocation();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user input search keyword")
    public void user_input_search_keyword(){
        travelPage.userInputLocation();
        smartWait.waitUntilPageIsLoaded(10);
        travelPage.keyDown();

        smartWait.waitUntilPageIsLoaded(10);

    }

    @And("user select from and to date")
    public void user_select_from_and_to_date() throws InterruptedException {
        travelPage.userClickFromDate();
        travelPage.userClickToDate();
    }

    @And("user click on search button")
    public void user_click_on_search_button() throws InterruptedException {
        travelPage.userClickSearchBtn();
    }

    @And("user click room button for select")
    public void user_click_room_button() throws InterruptedException {
        travelPage.userClickRoomBtn();
    }

    @Then("user should see the room page")
    public void user_should_see_the_booking_page(){
        Assert.assertTrue("User should see booking page",travelPage.isHotelAvailable());
    }
}
