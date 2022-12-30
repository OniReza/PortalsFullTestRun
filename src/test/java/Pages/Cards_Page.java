package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;
    @FindBy(xpath = "//span[text()='Cards']")
    public WebElement cardsMenuBtn;
    @FindBy(xpath = "//img[@class='cardImage']")
    public WebElement physicalCard;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div")
    public WebElement detailsTab;
    @FindBy(xpath = "//span[contains(text(),'Statementsssss')]")
    public WebElement statementTab;
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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]/button")
    public WebElement AssertPageStatement;

    public Cards_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void cardsMenuClick() {
        click(cardsMenuBtn);
    }
    public Boolean IsPopup()
    {
        return popup.isDisplayed();
    }
    public void buttonCancel()
    {
        click(btnCancel);
    }
    public boolean physicalCardCheck() {
        return physicalCard.isDisplayed();
    }

    public void physicalCardClick() {
        click(physicalCard);
    }

    public boolean detailsTabCheck() {
        return detailsTab.isDisplayed();
    }

    public void statementTabClick() {
            click(statementTab);
    }

    public boolean availableStatement() {
        return downloadBtn.isDisplayed();
    }
    public void statementDownloadClick() {
        downloadBtn.sendKeys(Keys.PAGE_DOWN);
        click(downloadBtn);
    }

    public void loadTabClick() {
        click(loadTab);
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
        click(confirmBtn);
    }

    public void enterOtp() {
        otpInput.sendKeys(BaseData.BaseOtp());
    }

    public void otpConfirmBtnClick() {
        click(otpConfirmBtn);
    }

    public boolean sucessMsgCheck() {
        return sucessmsg.isDisplayed();
    }

    public void okBtnClick() {
        click(okBtn);
    }

    public void unloadTabClick() {
        click(unloadTab);
    }

    public void topUpTabClick() {
        click(topupTab);
    }

    public void topupAmountDropdownClick() {
        click(topupAmountDropdown);
    }

    public void topupAmountClick() {
        click(topupAmount);
    }

    public void topupBtnClick() {
        click(topupBtn);
    }

    public boolean summaryCheck() {
        return topupSummary.isDisplayed();
    }

    public void topupConfirmBtnClick() {
        click(topupConfirmBtn);
    }

    public void OKbtnClick() {
        click(OKBtn);
    }

    public void transactionTabClick() {
        click(transactionsTab);
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
        click(exportPdf);
        Thread.sleep(1000);
        click(exportCsv);
    }

    public void virtualCardTabClick() {
        click(virtualCardTab);
    }

    public boolean createVCardBtnCheck() {
        System.out.println("CreateBTN: " + createVcardBtn.isDisplayed());
        return createVcardBtn.isDisplayed();

    }

    public boolean firstVCardCheck() {
        return firstVCard.isDisplayed();
    }

    public void firstVCardClick() {
        click(firstVCard);
    }

    /*Modify by: Abid Reza
    12-19-2022
    Update Method:isStatementAvailable();
    */
    public Boolean isStatementAvailable() {
            return AssertPageStatement.isDisplayed();
    }

}
