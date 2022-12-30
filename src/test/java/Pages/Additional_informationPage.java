package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Additional_informationPage {
    @FindBy(xpath = "//h5[contains (text(),additional)]")
    WebElement assertVal;

   // @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div[2]/div")
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
    WebElement annualVol;
    @FindBy(xpath = "//*[@id=\"menu-Annual Transaction Volume\"]/div[3]/ul/li[2]")
    WebElement answer1;

  //  @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[3]/div[2]/div[2]/div/div")
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[2]")
    WebElement netWorth;
    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[10]")
    WebElement answer2;

    //@FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[3]/div[3]/div[2]/div/div")
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[3]")
    WebElement empType;
    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    WebElement answer3;

    //@FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[3]/div[4]/div[2]/div/div")
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[4]")
    WebElement accUsage;
    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[5]")
    WebElement answer4;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

     public Additional_informationPage(WebDriver driver){
         PageFactory.initElements(driver,this);
    }
    public  void  Assertion(){
        System.out.println(assertVal.getText());
        Assert.assertEquals("Additional Information", assertVal.getText());
    }
    public  void  AnnualVal(){
        annualVol.click();
    }
    public  void  Answer_01(){
        answer1.click();
    }
    public  void  NetWorth(){
        netWorth.click();
    }
    public  void  Answer_02(){
        answer2.click();
    }
    public  void  EmpType(){
        empType.click();
    }
    public  void  Answer_03(){
        answer3.click();
    }
    public  void  AccUsage(){
        accUsage.click();
    }
    public  void  Answer_04(){
        answer4.click();
    }

    public  void  Sumbit(){
      //  submit.click();
        System.out.println("Button: "+submit.getText());
    }
}
