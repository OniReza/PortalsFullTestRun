package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Cards_Page extends CommonPageMethods {
    public static WebDriver driver;
    @FindBy(xpath = "//span[text()='Cards']")
    public WebElement cardsMenuBtn;
    @FindBy(xpath = "//img[@class='cardImage']")
    public WebElement physicalCard;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div")
    public WebElement detailsTab;
    @FindBy(xpath = "//span[contains(text(),'Statements')]")
    public WebElement statementTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]/button")
    public WebElement AssertPageStatement;
    @FindBy(xpath = "(//span[contains(text(),'DOWNLOAD')])[1]")
    public WebElement downloadBtn;
    @FindBy(xpath = "//span[contains(text(),'Load')]")
    public WebElement loadTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[3]/div[1]/div/div[1]/div[1]/div/div/button/span[1]/span[1]")
    public WebElement loadWalletDropdown;
    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock' and text()='USD'])[1]")
    public WebElement usd;

    @FindBy(xpath = "(//input[contains(@inputmode,'decimal')])[1]")
    public WebElement loadAmount;
    @FindBy(xpath = "(//input[contains(@inputmode,'decimal')])[1]")
    public WebElement unLoadAmount;

    @FindBy(xpath = "//span[contains(text(),'CONFIRM')]")
    public WebElement confirmBtn;

    @FindBy(xpath = "//span[contains(text(),'Overview')]")
    public WebElement overview;

    @FindBy(xpath = "//input[@name='secretCode']")
    public WebElement otpInput;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    public WebElement otpConfirmBtn;

    @FindBy(xpath = "//span[contains(text(),'successfully')]")
    public WebElement sucessmsg;
    @FindBy(xpath = "//span[@class='MuiButton-label' and text()='Ok']")
    public WebElement okBtn;

    @FindBy(xpath = "//span[contains(text(),'Unload')]")
    public WebElement unloadTab;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[3]/div[1]/div/div[2]/div[1]/div/div/button")
    public WebElement unloadWalletDropdown;

    @FindBy(xpath = "//span[contains(text(),'Topup')]")
    public WebElement topupTab;
    @FindBy(xpath = "//div[@role='button' and contains(text(),'$')]")
    public WebElement topupAmountDropdown;
    @FindBy(xpath = "//li[@role='option' and contains(text(),'$50')]")
    public WebElement topupAmount;

    @FindBy(xpath = "//span[contains(text(),'TOPUP')]")
    public WebElement topupBtn;
    @FindBy(xpath = "//span[text()='Summary']")
    public WebElement topupSummary;
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    public WebElement topupConfirmBtn;

    //++++++++++++++++++++++++++++++++++++++PIN+++++++++++++++++++++++++++++++++++++++++
    @FindBy(xpath = "//span[contains(text(),'Pin')]")
    public WebElement pinTab;
    @FindBy(name = "reEnterPassword")
    WebElement pinPassword;
    @FindBy(xpath = "//span[contains(text(),'SUBMIT') or contains(text(),'submit')]")
    WebElement pinSubmit;
    @FindBy(xpath = "//span[contains(text(),'Your pin is')]")
    WebElement viwedPin;
    //++++++++++++++++++++++++++++++++++++++PIN+++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++Digital card+++++++++++++++++++++++++++++++++++++++++
    @FindBy(xpath = "//span[contains(text(),'Digital Card')]")
    WebElement digitalCardTab;
    @FindBy(id="code")
    WebElement otp;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement showCardDetailsBtn;
    @FindBy(xpath = "//label[contains(text(),'Card Number')]")
    WebElement viewedCardNum;
    @FindBy(xpath = "//label[contains(text(),'Expire')]")
    WebElement viewedExpDate;
    @FindBy(xpath = "//label[contains(text(),'CVV')]")
    WebElement viewedCVV;

    //++++++++++++++++++++++++++++++++++++++Digital card+++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++Digital card+++++++++++++++++++++++++++++++++++++++++
    public void digitalCardTabClick(){
        click(digitalCardTab);
    }
    public void enterOtpDigitalCard(){
        otp.sendKeys(BaseData.BaseOtp());
    }
    public void showCardDetailsBtnClick(){
        showCardDetailsBtn.click();
    }
    public boolean cardDetaisCheck(){
        return viewedCardNum.isDisplayed();
    }


    //++++++++++++++++++++++++++++++++++++++Digital card+++++++++++++++++++++++++++++++++++++++++



    @FindBy(xpath = "//span[contains(text(),'Transactions')]")
    public WebElement transactionsTab;
    @FindBy(xpath = "(//span[@class='Text undefined small undefined thin' and contains(text(),'-')])[1]")
    public WebElement latestTransection;
    @FindBy(xpath = "(//span[@class='fa fa-external-link offset-right-10'])[1]")
    public WebElement exportPdf;
    @FindBy(xpath = "(//span[@class='fa fa-external-link offset-right-10'])[2]")
    public WebElement exportCsv;

    @FindBy(xpath = "(//button[@role='button' and text()='Ok' or text()='OK'])")
    public WebElement OKBtn;

    @FindBy(xpath = "//span[text()='Virtual Cards']")
    public WebElement virtualCardTab;

    @FindBy(xpath = "//span[contains(text(),'Create Virtual Card')]")
    public WebElement createVcardBtn;
    @FindBy(xpath = "(//p[contains(text(),'Available Balance')])[1]")
    public WebElement firstVCard;

    public Cards_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void cardsMenuClick() {
        cardsMenuBtn.click();
    }

    public boolean physicalCardCheck() {
        return physicalCard.isDisplayed();
    }

    public void physicalCardClick() {
        physicalCard.click();
    }

    public boolean detailsTabCheck() {
        return detailsTab.isDisplayed();

    }

    public void statementTabClick() {
        statementTab.click();
    }

//    public boolean availableStatement() {
//        return downloadBtn.isDisplayed();
//    }
public Boolean isStatementAvailable() {
    return AssertPageStatement.isDisplayed();
}

    public void statementDownloadClick() {
        downloadBtn.click();
    }

    public void loadTabClick() {
        loadTab.click();
    }

    public void enterLoadAmount() {
        loadAmount.sendKeys("55");
    }

    public void enterUnloadAmount() {
        unLoadAmount.sendKeys("35");
    }

    public boolean overviewCheck() {
        return overview.isDisplayed();
    }

    public void confirmBtnClick() {
        confirmBtn.click();
    }

    public void enterOtp() {
        otpInput.sendKeys(BaseData.BaseOtp());
    }

    public void otpConfirmBtnClick() {
        otpConfirmBtn.click();
    }

    public boolean sucessMsgCheck() {
        return sucessmsg.isDisplayed();
    }

    public void okBtnClick() {
       okBtn.click();
    }

    public void unloadTabClick() {

        unloadTab.click();
    }

    public void topUpTabClick() {
        topupTab.click();
    }

    public void topupAmountDropdownClick() {
        topupAmountDropdown.click();
    }

    public void topupAmountClick() {
        topupAmount.click();
    }

    public void topupBtnClick() {
        topupBtn.click();
    }

    public boolean summaryCheck() {
        return topupSummary.isDisplayed();
    }

    public void topupConfirmBtnClick() {
        topupConfirmBtn.click();
    }

    public void OKbtnClick() {
       OKBtn.click();
    }

    //++++++++++++++++++++PIN++++++++++++
    public void pinTabClick(){
        pinTab.click();
    }
    public void enterPinPass(){
        pinPassword.sendKeys(BaseData.BasePassword());
    }
    public void pinSubmitClick(){
        pinSubmit.click();
    }
    public boolean viewedPinCheck(){
        return viwedPin.isDisplayed();
    }
//+++++++++++++++++++++++++++++++++++++PIN+++++++++++++++++++++++++++++++++
    public void transactionTabClick() {
        transactionsTab.click();
    }

    public boolean latestTransectionCheck() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        Calendar cal = Calendar.getInstance();
        String dt = dateFormat.format(cal.getTime());
        String str = latestTransection.getText();

        if (latestTransection.getText().trim().equals(dt)) {
            return latestTransection.isDisplayed();
        } else {
            return false;
        }
    }

    public void exportTransaction() throws InterruptedException {
        exportPdf.click();
        Thread.sleep(1000);
        exportCsv.click();
    }

    public void virtualCardTabClick() {
        virtualCardTab.click();
    }

    public boolean createVCardBtnCheck() {
        System.out.println("CreateBTN: " + createVcardBtn.isDisplayed());
        return createVcardBtn.isDisplayed();

    }

    public boolean firstVCardCheck() {
        return firstVCard.isDisplayed();
    }

    public void firstVCardClick() {
        firstVCard.click();
    }

}
