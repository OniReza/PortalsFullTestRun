package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import Utility.Random_data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Accounts_Page extends CommonPageMethods {
    public static WebDriver driver;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]")
    public WebElement graph;

    @FindBy(xpath = "(//span[text()='Accounts'])[1]")
    public WebElement accMenubtn;

    //Accounts Move xpaths
    @FindBy(xpath = "(//p[contains(text(),'Available Balance')])[1]")
    public WebElement usdWallet;
    @FindBy(xpath = "//span[contains(text(),'Euro')]")
    public WebElement euroWallet;
    @FindBy(xpath = "//span[contains(text(),'Pound')]")
    public WebElement gbpWallet;
    @FindBy(xpath = "//span[contains(text(),'Yen')]")
    public WebElement jpyWallet;
    @FindBy(xpath = "//span[contains(text(),'Yuan')]")
    public WebElement cnyWallet;
    @FindBy(xpath = "//span[contains(text(),'Peso')]")
    public WebElement phpWallet;
    @FindBy(xpath = "(//span[text()='Move'])")
    public WebElement moveTab;
    @FindBy(xpath = "//div[contains( text(),'Beneficiary')]")
    public WebElement selectBeneficiaryDropdown;
    @FindBy(xpath = "//Span[contains( text(),'€')]")
    public WebElement euroAcc;
    @FindBy(xpath = "//Span[contains( text(),'$')]")
    public WebElement usdAcc;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement sendAmount;
    @FindBy(xpath = "(//button[text()='Confirm'])")
    public WebElement confirmBtn;
    @FindBy(xpath = "(//input[@type='text' and @name='secretCode'])")
    public WebElement secretCode;
    @FindBy(xpath = "(//span[contains(text(),'successfully')])")
    public WebElement sucessMsg;
    @FindBy(xpath = "(//button[@role='button' and text()='Ok' or text()='OK'])")
    public WebElement okBtn;
    @FindBy(xpath = "(//span[text()='Details'])")
    public WebElement detailsTab;
    //Accounts deposit
    @FindBy(xpath = "(//span[text()='Deposit'])")
    public WebElement depositTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div/div/input")
    public WebElement fromDropdwn;
    @FindBy(xpath = "//span[contains(text(),'Debit or Credit Card')]")
    public WebElement debitCard;
    @FindBy(xpath = "//input[@name='topUpAmount']")
    public WebElement loadAmount;
    @FindBy(xpath = "//div[@class='CheckboxWithValidation']")
    public WebElement trAggrement;
    @FindBy(xpath = "(//span[text()='Transfer Summary'])")
    public WebElement summary;
    @FindBy(xpath = "(//span[contains(text(),'Expedite Fee')])")
    public WebElement expeditSummary;
    @FindBy(xpath = "//b[contains(text(),'Congratulations')]")
    public WebElement loadSucessMsg;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div")
    public WebElement accountsTabUsd;
    @FindBy(xpath = "//span[contains(text(),'Local (US Bank)')]")
    public WebElement localUSBank;
    @FindBy(xpath = "//span[contains(text(),'Local (UK Bank)')]")
    public WebElement localUKBank;


    @FindBy(xpath = "//span[contains(text(),'International')]")
    public WebElement intlNonUKBank;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/div")
    public WebElement localUSBankBeneficiary;
    @FindBy(xpath = "//span[contains(text(),'Crypto Deposit')]")
    public WebElement crypto;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement cryptoSendAmount;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/label")
   // @FindBy(xpath = "//input[@class='hidden' and  @type='checkbox']")
    //@FindBy(xpath = "(//input[@class='hidden' and  @type='checkbox'])//self::input")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[1]/div/div")
    public WebElement cryptoSummary;
    @FindBy(xpath = "(//span[text()='Payments'])")
    public WebElement paymentTabBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[1]/div")
    public WebElement paymentTabPage;
    @FindBy(xpath = "(//span[text()='PAY'])[2]")
    public WebElement memberPayBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]")
    public WebElement beneficiary;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement paymentRef;
    @FindBy(xpath = "(//span[text()='Summary'])")
    public WebElement trnsSummary;
    @FindBy(xpath = "(//span[text()='PAY'])[1]")
    public WebElement makePayBtn;
    @FindBy(xpath = "//span[text()='Individual']")
    public WebElement individual;
    @FindBy(xpath = "//span[text()='New']")
    public WebElement newRecipient;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement fName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lName;
    @FindBy(xpath = "//*[@id=\"mui-component-select-country\"]")
    public WebElement countryDropdown;
    @FindBy(xpath = "//li[contains(text(),'America')]")
    public WebElement america;
    @FindBy(xpath = "//input[@name='addressLine1']")
    public WebElement addressLine;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"mui-component-select-state\"]")
    public WebElement stateDropdown;
    @FindBy(xpath = "//span[text()='Arkansas']")
    public WebElement recipientState;
    @FindBy(xpath = "//input[@name='postCode']")
    public WebElement postCode;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phone;
    @FindBy(xpath = "//*[@id=\"mui-component-select-currency\"]/div/div[2]")
    public WebElement currencyDropdown;
    @FindBy(xpath = "(//span[contains(text(),'Dollar ')])[2]")
    public WebElement usd;
    @FindBy(xpath = "//*[@id=\"mui-component-select-bankCountry\"]")
    public WebElement bankCountry;
    @FindBy(xpath = "//input[@name='bankName']")
    public WebElement bankName;
    @FindBy(xpath = "//input[@name='bankAddress']")
    public WebElement bankAddress;
    @FindBy(xpath = "//input[@name='bankCity']")
    public WebElement bankCity;
    @FindBy(xpath = "//*[@id=\"mui-component-select-bankState\"]")
    public WebElement bankStateDropdown;
    @FindBy(xpath = "(//span[text()='Delaware'])")
    public WebElement bankState;
    @FindBy(xpath = "//input[@name='bankPostCode']")
    public WebElement bankPostCode;
    @FindBy(xpath = "//input[@name='bankRoutingNumber']")
    public WebElement bankRountingNum;
    @FindBy(xpath = "//input[@name='bankAccountNumber']")
    public WebElement bankAccNum;
    @FindBy(xpath = "//input[@name='bankAccountName']")
    public WebElement bankAccName;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payAmount;
    @FindBy(xpath = "//span[text()='Now']")
    public WebElement now;
    @FindBy(xpath = "//input[@name='paymentReference']")
    public WebElement payRef;
    @FindBy(xpath = "//input[@name='reason']")
    public WebElement paymentReson;
    @FindBy(xpath = "//input[@name='note']")
    public WebElement paymentNote;
    @FindBy(xpath = "//span[text()='PAY']")
    public WebElement payBtn;
    @FindBy(xpath = "//span[text()='Request accepted']")
    public WebElement reqAcceptmsg;
    @FindBy(xpath = "//span[text()='Business']")
    public WebElement business;
    @FindBy(xpath = "//input[@name='businessName']")
    public WebElement busName;
    @FindBy(xpath = "//input[@name='registrationNumber']")
    public WebElement busRegNum;
    @FindBy(xpath = "//*[@id=\"mui-component-select-country\"]")
    public WebElement busCountry;
    @FindBy(xpath = "//span[text()='Existing']")
    public WebElement existing;
    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement select;
    @FindBy(xpath = "//span[text()='Transactions']")
    public WebElement transactionsTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/a/span")
    public WebElement firstPTransaction;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[4]/div[3]/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement firstCTransactions;
    @FindBy(xpath = "(//span[text()='Statements'])")
    public WebElement statementsTabBtn;
    @FindBy(xpath = "(//button[contains(text(),'DOWNLOAD')])[1]")
    public WebElement downloadBtn;
    @FindBy(xpath = "(//span[text()='Withdraw'])")
    public WebElement withdrawTab;
    @FindBy(xpath = "(//div[@role=\"option\"])[1]")
    public WebElement withdrawExistingBeneficiary;
    @FindBy(xpath = "(//div[contains(text(),'Add')])")
    public WebElement addPersonalAccBtn;
    @FindBy(xpath = "//option[@value='US']")
    public WebElement countryUS;
    @FindBy(xpath = "//option[@value='USD']")
    public WebElement currencyUSD;
    @FindBy(xpath = "//button[@role='button' and text()='Next']")
    public WebElement nextBtn;
    @FindBy(xpath = "(//option[@value='Colorado'])")
    public WebElement stateColorado;
    @FindBy(xpath = "(//input[@name='beneficiaryReference'])")
    public WebElement beneficiaryReference;
    @FindBy(xpath = "(//input[@name='destinationBankName'])")
    public WebElement destinationBankName;
    @FindBy(xpath = "(//input[@name='addressLine1'])")
    public WebElement address;
    @FindBy(xpath = "(//input[@name='destinationBankCity'])")
    public WebElement destinationBankCity;
    @FindBy(xpath = "(//input[@name='sortCode'])")
    public WebElement sortCode;
    @FindBy(xpath = "(//input[@name='accountNo'])")
    public WebElement accountNo;
    @FindBy(xpath = "(//input[@name='swiftCode'])")
    public WebElement swiftCode;
    @FindBy(xpath = "(//input[@name='iban'])")
    public WebElement iban;
    @FindBy(xpath = "(//div[@class='ui fitted checkbox Checkbox'])[1]")
    public WebElement expediteFee;
    @FindBy(xpath = "(//div[@class='ui fitted checkbox Checkbox'])[1]")
    public WebElement withdrawTransferAggrement;
    @FindBy(xpath = "(//span[text()='Pay'])")
    public WebElement payTab;
    @FindBy(xpath = "(//span[text()='PAY'])[1]")
    public WebElement ffPayBtn;
    @FindBy(xpath = "(//div[contains(text(),'Pay someone new')])")
    public WebElement paySomeoneNewBtn;
    @FindBy(xpath = "(//input[@name='firstName'])")
    public WebElement firstName;
    @FindBy(xpath = "(//input[@name='lastName'])")
    public WebElement lastName;
    @FindBy(xpath = "(//input[@name='dateOfBirth'])")
    public WebElement dob;
    // @FindBy(xpath = "(//input[@type='text']//parent::div[@class='ui input'])[1]")
    @FindBy(xpath = "(//div[@class='ui input']//child::input[@type='text'])[1]")
    public WebElement paymentReason;
    @FindBy(xpath = "(//div[@class='ui input']//child::input[@type='text'])[2]")
    public WebElement paymentReference;
    @FindBy(xpath = "(//span[text()='PAY'])[2]")
    public WebElement businessPayBtn;
    @FindBy(xpath = "(//div[contains(text(),'Pay to new business')])")
    public WebElement paynewBusinessBtn;
    @FindBy(xpath = "(//input[@name='businessName'])")
    public WebElement businessName;
    @FindBy(xpath = "(//input[@name='registrationNumber'])")
    public WebElement busRegNumber;
    @FindBy(xpath = "(//span[text()='PAY'])[3]")
    public WebElement anotherMemberPayBtn;

    @FindBy(xpath = "(//span[contains(text(),' No records')])[1]")
    public WebElement noTransectionLabel;

    public Accounts_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void withdrawTabClick() {
        click(withdrawTab);
    }

    public void addPersonalAccClick() {
        click(addPersonalAccBtn);
    }

    public void destinationBankCountry() throws InterruptedException {
        click(countryUS);
    }

    public void beneficiaryCurrencyClick() {
        click(currencyUSD);
    }

    public void nextBtnClick() {
        click(nextBtn);
    }

    public void withdrawBeneficiaryDetails() throws InterruptedException {
        click(countryUS);
        Thread.sleep(200);
        click(stateColorado);
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");
    }

    public void beneficiaryCLick() {
        click(withdrawExistingBeneficiary);
    }

    public void withdrawCheckBox() throws InterruptedException {
        click(expediteFee);
        Thread.sleep(3000);
        click(withdrawTransferAggrement);
    }

    public void payTabClick() {
        click(payTab);
    }

    public void ffPayBtnClick() {
        click(ffPayBtn);
    }

    public void paySomeoneNewBtnClick() {
        click(paySomeoneNewBtn);
    }

    public void payFriendorFamilyDetails() throws InterruptedException {
        firstName.sendKeys(Random_data.firstName());
        Thread.sleep(200);
        lastName.sendKeys(Random_data.lastName());
        Thread.sleep(200);
        click(dob);
        Thread.sleep(200);
        dob.sendKeys("02052000");
        Thread.sleep(200);
        click(countryUS);
        Thread.sleep(500);
        click(stateColorado);
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");

    }

    public void paymentReason() {
        paymentReason.sendKeys("Automation portal");
    }

    public void paymentRef() {
        paymentReference.sendKeys("Automation");

    }

    public void businessPayBtnClick() {
        click(businessPayBtn);
    }

    public void payNewBusinessClick() {
        click(paynewBusinessBtn);
    }

    public void payBusinessDetails() throws InterruptedException {
        businessName.sendKeys(Random_data.firstName());
        Thread.sleep(200);
        busRegNumber.sendKeys(Random_data.businessRegNum());
        Thread.sleep(200);
        click(countryUS);
        Thread.sleep(500);
        click(stateColorado);
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");

    }

    public void anotherMemberPayBtnClick() {
        click(anotherMemberPayBtn);
    }

    public Boolean checkgraph() {
        return graph.isDisplayed();

    }

    public void localUSBankClick() {
        click(localUSBank);
    }

    public void intlNonUKBankClick() {
        click(intlNonUKBank);
    }
    public void localUKBankClick() {
        click(localUKBank);
    }
    public boolean localUSBankBeneficiaryCheck() {
        return localUSBankBeneficiary.isDisplayed();
    }

    public void cryptoClick() {
        click(crypto);
    }

    public void enterCryptoSendAmount() {
        cryptoSendAmount.sendKeys(".1");
    }

    public void checkBoxClick() {
        click(checkBox);
    }

    public boolean cryptoSummaryCheck() {
        return cryptoSummary.isDisplayed();

    }

    public void accMenuClick() {
        click(accMenubtn);
    }

    public void usdWalletClick() {
        click(usdWallet);
    }
    public void euroWalletClick() {
        click(euroWallet);
    }
    public void gbpWalletClick() {
        click(gbpWallet);
    }
    public void jpyWalletClick() {
        click(jpyWallet);
    }
    public void cnyWalletClick() {
        click(cnyWallet);
    }
    public void phpWalletClick() {
        click(phpWallet);
    }

    public void moveTabClick() {
        click(moveTab);
    }

    public void benDropdownClick() {
        click(selectBeneficiaryDropdown);
    }

    public void euroAccClcik() {
        click(euroAcc);
    }
    public void usdAccClcik() {
        click(usdAcc);
    }

    public void enterSendingAmount() {
        sendAmount.sendKeys("31");
    }

    public void confirmBtnClick() {
        confirmBtn.sendKeys(Keys.PAGE_DOWN);
        click(confirmBtn);
    }

    public void enterSecretCode() {
        String Otp = BaseData.BaseOtp();
        System.out.println("Move: " + Otp);
        secretCode.sendKeys(Otp);
    }

    public boolean checkSuccessMsg() {
        return sucessMsg.isDisplayed();
    }

    public void okBtnClick() {
        click(okBtn);
    }

    public boolean checkDetailsTab() {
        return detailsTab.isDisplayed();
    }

    public void depositTabClick() {
        click(depositTab);
    }

    public void fromDropdwnClick() {
        click(fromDropdwn);
    }

    public void debitCardClick() {
        click(debitCard);
    }

    public void enterloadAmount() {
        loadAmount.sendKeys("50");
    }

    public void aggrementClick() {
        click(trAggrement);
    }

    public void checkSummary() {
        click(summary);
    }

    public boolean checkExpeditSummary() {
        return expeditSummary.isDisplayed();
    }

    public boolean checkLoadSuccessMsg() {
        return loadSucessMsg.isDisplayed();
    }

    public void clickOKbtn() {
        click(okBtn);
    }

    public boolean checkAccountsTab() {
        return accountsTabUsd.isDisplayed();

    }

    public void paymentTabClick() {
        click(paymentTabBtn);
    }

    public boolean paymentPage() {
        return paymentTabPage.isDisplayed();
    }

    public void memberPayBtnClick() {
        click(memberPayBtn);
    }

    public void beneficiarySelect() {
        click(beneficiary);
    }

    public void enterPaymentRef() {
        paymentRef.sendKeys("Automation");
    }

    public void checkTransferSummary() {
        click(trnsSummary);
    }

    public void makePaymentClick() throws InterruptedException {
        click(makePayBtn);
        Thread.sleep(5000);
    }

    public void toIndividual() {
        click(individual);
    }

    public void newBtnClick() {
        click(newRecipient);
    }

    public void recipientDetails() throws InterruptedException {
        fName.sendKeys(Random_data.firstName());
        Thread.sleep(300);
        lName.sendKeys(Random_data.lastName());
        Thread.sleep(300);
        click(countryDropdown);
        Thread.sleep(1500);
        click(america);
        Thread.sleep(300);
        addressLine.sendKeys(Random_data.address());
        Thread.sleep(300);
        city.sendKeys("Anchorage");
        Thread.sleep(300);
        click(stateDropdown);
        Thread.sleep(1500);
        click(recipientState);
        Thread.sleep(300);
        postCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        email.sendKeys(Random_data.email());
        Thread.sleep(300);
        phone.sendKeys("20255300169");
        Thread.sleep(300);
    }

    public void bankDetails() throws InterruptedException {
        click(currencyDropdown);
        Thread.sleep(1000);
        click(usd);
        Thread.sleep(300);
        click(bankCountry);
        Thread.sleep(1000);
        click(america);
        Thread.sleep(300);
        bankName.sendKeys("Bank of America");
        Thread.sleep(300);
        bankAddress.sendKeys("365 old street");
        Thread.sleep(300);
        bankCity.sendKeys("Cansas");
        Thread.sleep(300);
        click(bankStateDropdown);
        Thread.sleep(1500);
        click(bankState);
        Thread.sleep(300);
        bankPostCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        bankRountingNum.sendKeys("233394133");
        Thread.sleep(300);
        bankAccNum.sendKeys(Random_data.bankAccNum());
        Thread.sleep(300);
        bankAccName.sendKeys(Random_data.fullName());
        Thread.sleep(300);
    }


    public void amount() throws InterruptedException {
        payAmount.sendKeys("20");
        Thread.sleep(3000);
    }

    public void whenToPay() {
        click(now);
    }

    public void references() throws InterruptedException {
        payRef.sendKeys("Test Automation");
        Thread.sleep(300);
        paymentReson.sendKeys("Payment Automation");
        Thread.sleep(300);
        paymentNote.sendKeys("Payment to new Individual");
        Thread.sleep(300);
    }

    public void payClick() throws InterruptedException {
        click(payBtn);
        Thread.sleep(5000);
    }

    public boolean checkReqAcceptMsg() throws InterruptedException {
        boolean msg = reqAcceptmsg.isDisplayed();
        Thread.sleep(300);
        click(okBtn);
        return msg;
    }

    public void businessClick() {
        click(business);
    }

    public void recipientBusinessDetails() throws InterruptedException {
        busName.sendKeys(Random_data.businessName());
        Thread.sleep(300);
        busRegNum.sendKeys(Random_data.businessRegNum());
        Thread.sleep(300);
        click(busCountry);
        Thread.sleep(1500);
        click(america);
        Thread.sleep(300);
        addressLine.sendKeys(Random_data.address());
        Thread.sleep(300);
        city.sendKeys("Anchorage");
        Thread.sleep(300);
        click(stateDropdown);
        Thread.sleep(1500);
        click(recipientState);
        Thread.sleep(300);
        postCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        email.sendKeys(Random_data.email());
        Thread.sleep(300);
        phone.sendKeys("20255300169");
        Thread.sleep(300);
    }

    public void clickExisting() {
        click(existing);
    }

    public void selectRecipients() {
        click(select);
    }

    public void transactionsTabClick() {
        click(transactionsTab);
    }

    public boolean pendingTransection() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar cal = Calendar.getInstance();
        String dt = dateFormat.format(cal.getTime());
        String str = firstPTransaction.getText();
        System.out.println("get text: " + str);
        System.out.println("date: " + dt);
        if (firstPTransaction.getText().trim().equals(dt.trim())) {
            return firstPTransaction.isDisplayed();
        }
        return false;
    }

    public boolean completedTransection() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        Calendar cal = Calendar.getInstance();
        String dt = dateFormat.format(cal.getTime());
        String str = firstCTransactions.getText();
        System.out.println("get text: " + str);
        System.out.println("date: " + dt);
        if (firstCTransactions.getText().trim().equals(dt.trim())) {
            return firstCTransactions.isDisplayed();
        }
        return false;
    }
    public void statementsTabBtnClick(){
        click(statementsTabBtn);
    }
    public boolean downloadBtnCheck(){
            return downloadBtn.isDisplayed();
    }

    public void downloadBtnClick(){
        click(downloadBtn);
    }

    public boolean noTranscetionLabelCheck(){
        return noTransectionLabel.isDisplayed();
    }

}
