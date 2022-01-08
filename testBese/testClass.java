package testBese;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testClass {
    public static WebDriver driver;

    public static void SetWithSpecificURL(String url) {
/**
 * this method will clear a textbox and send text
 * @param url
 */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    /**
     * this method will quit an open browser
     */
    public static void Teardown() {
        if (driver != null){
            driver.quit();
        }
    }

    }