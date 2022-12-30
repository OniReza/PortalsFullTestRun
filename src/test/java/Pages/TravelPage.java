package Pages;

import Utility.CommonPageMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPage extends CommonPageMethods{
    public static WebDriver driver;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/div/div[2]/ul[1]/div[5]")
    public WebElement btnTravel;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[1]/div/div[1]/div/div/div")
    public WebElement ddlPerson;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[2]")
    public WebElement ddlPersonOption;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/button[2]")
    public WebElement ddlLocation;

    @FindBy(xpath ="/html/body/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div/input")
    public WebElement locationInput;


    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[1]/div/div[3]/div/div/div/input")
    public WebElement selectFromDate;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[2]")
    public WebElement selectNextArrow;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[4]/div[7]/button")
    public WebElement selectFromDateRang;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]")
    public WebElement btnOk;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[1]/div/div[4]/div/div/div/input")
    public WebElement selectToDate;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[2]")
    public WebElement selectNextArrowTo;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[4]/button")
    public WebElement selectFromDateRangTo;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]")
    public WebElement btnOkTo;
    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[1]/div/div[5]/button")
    public WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/div/div[2]/div/div[4]/div/div")
    public WebElement freeCancelation;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[3]")
    public WebElement selectCancelation;

    @FindBy(xpath = "//*[@id=\"enhanced-table-checkbox-0\"]/div/div[2]/div/div[2]/button")
    public WebElement clickRoomBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]")
    public WebElement AssertPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;

    public TravelPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void userClickOnTravel()
    {
        click(btnTravel);
    }
    public void userClickPersonList()
    {
        click(ddlPerson);
    }

    public void userClickPersonOption()
    {
       click(ddlPersonOption);
    }

    public void userClickLocation()
    {
        click(ddlLocation);
    }

    public void userInputLocation()
    {
        locationInput.sendKeys("LA");
    }

    public void keyDown()
    {
        locationInput.sendKeys(Keys.ARROW_DOWN);
        locationInput.sendKeys(Keys.ENTER);
    }

    public void userClickFromDate()throws InterruptedException
    {
        click(selectFromDate);
        click(selectNextArrow);
        Thread.sleep(1000);
        click(selectFromDateRang);
        Thread.sleep(2000);
        click(btnOk);
    }

    public void userClickToDate()throws InterruptedException
    {
        click(selectToDate);
        click(selectNextArrowTo);
        Thread.sleep(1000);
        click(selectFromDateRangTo);
        Thread.sleep(2000);
        click(btnOkTo);
    }
    public void userClickSearchBtn() throws InterruptedException
    {
        click(btnSearch);
        Thread.sleep(4000);


        if(clickRoomBtn.isDisplayed())
        {
            System.out.println("Element is Present");
        }
        else
        {
            System.out.println("Element not Present");
        }

    }

    public void userClickRoomBtn() throws InterruptedException
    {
        click(clickRoomBtn);

    }
    public Boolean isHotelAvailable() {
        return AssertPage.isDisplayed();
    }

    public Boolean IsPopup()
    {
        return popup.isDisplayed();
    }
    public void buttonCancel()
    {
        click(btnCancel);
    }
}
