package Pages;

import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstanceRewardsPage extends CommonPageMethods {


    @FindBy(xpath = "//span[text()='Instant Rewards']")
    public WebElement btnInstanceRewards;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div")
    public WebElement cardDropList;

       @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[2]")
    public WebElement cardSelectEUR;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[1]")
    public WebElement cardSelectUSD;

    @FindBy(xpath = "//*[@id=\"enhanced-table-checkbox-0\"]/div/div[4]/button")
    public WebElement selectCardBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/h3")
    public WebElement AssertRewardPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[7]/textarea[1]")
    public WebElement inputMsgBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div")
    public WebElement selectWallet;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[3]")
    public WebElement walletOptionsGBP;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    public WebElement walletOptionsUSD;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[4]/button")
    public WebElement btnRedeem;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]/div/div/button")
    public WebElement btnOrderButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[2]")
    public WebElement AssertPaymentPage;

    @FindBy( css = "#root > div > div > div > div > main > div > div > div > div > div > div > div > div.MuiGrid-root.header-container > div.MuiGrid-root.close-button.MuiGrid-item.MuiGrid-grid-xs-12 > svg")
    public WebElement RewardsCloseBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/header/div/div[2]/div/a[2]")
    public WebElement RewardsTabs;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[1]/img")
    public WebElement RewardsAssert;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;

    public InstanceRewardsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void ClickInstanceBtn()
    {
        click(btnInstanceRewards);
    }

    public void SelectCard()throws InterruptedException
    {
        click(cardDropList);
        Thread.sleep(2000);
        click(cardSelectEUR);
        Thread.sleep(3000);
        click(cardDropList);
        Thread.sleep(2000);
        click(cardSelectUSD);
    }
    public void selectCardFromList()
    {
        click(selectCardBtn);
    }
    public Boolean isPaymentMethodAvailable() {
        return AssertRewardPage.isDisplayed();
    }
    public void msgBox(){
        inputMsgBox.sendKeys("This is a automation testing.\n Thank you.");
    }

    public void btnWallet()throws InterruptedException{
        click(selectWallet);
        Thread.sleep(2000);
        click(walletOptionsGBP);
        Thread.sleep(3000);
        click(selectWallet);
        Thread.sleep(2000);
        click(walletOptionsUSD);
    }

    public void clickRedeemBtn() {
        click(btnRedeem);
    }

    public void clickOrderBtn() {
        click(btnOrderButton);
    }
    public Boolean isPaymentMethodSuccessfully() {
        return AssertPaymentPage.isDisplayed();
    }

    public void closeBtn(){
        click(RewardsCloseBtn);
    }

    public void tabsRewards(){
        click(RewardsTabs);
    }
    public Boolean isRewardsSuccessfully(){
        return RewardsAssert.isDisplayed();

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
