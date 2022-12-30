package Pages;

import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends CommonPageMethods {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/div/div[2]/ul[1]/div[8]")
    public WebElement btnShopping;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/input")
    public WebElement inputDescription;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/input")
    public WebElement inputBrand;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/div[3]/div/input")
    public WebElement inputStyle;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/div[4]/div/input")
    public WebElement inputColor;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/div[5]/div/input")
    public WebElement inputWebLink;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[1]")
    public WebElement searchReq;

    @FindBy(xpath = "//span[text()='All']")
    public WebElement allReq;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[2]")
    public WebElement reqStatus;

    @FindBy(xpath = "//span[text()='In Progress']")
    public WebElement inProgressStatus;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[1]/div/div[2]/div/div/form/button")
    public WebElement buttonRequest;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[2]/div/div[2]/div[2]/div")
    public WebElement shoppingAssertPage;
    public ShoppingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void ShoppingBtn(){
        click(btnShopping);
    }
    public void DescriptionInput(){
        inputDescription.sendKeys("This is a test description");
    }
    public void BrandInput(){
        inputBrand.sendKeys("Nike");
    }
    public void StyleInput(){
        inputStyle.sendKeys("Test style");
    }
    public void ColorInput(){
        inputColor.sendKeys("Green");
    }
    public void WebLinkInput(){
        inputWebLink.sendKeys("www.test.com");
    }


    public void searchReqClick(){click(searchReq);}
    public void allReqClick(){click(allReq);}
    public void reqStatusClick(){click(reqStatus);}
    public void inProgressStatusClick(){click(inProgressStatus);}

    public void RequestButton(){
        click(buttonRequest);
    }

    public Boolean IsPopup()
    {
        return popup.isDisplayed();
    }

    public void buttonCancel()
    {
        click(btnCancel);
    }

    public Boolean isRequestPageAvailable() {
        return shoppingAssertPage.isDisplayed();
    }
}
