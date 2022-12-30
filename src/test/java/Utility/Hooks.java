package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.OutputType.BYTES;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static WebDriver getDriver() {

        if (null == driver) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
//            driver = new FirefoxDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return driver;
    }

    @After
    public void tearDown()
    {
        driver.quit();
        driver.close();
    }



}
