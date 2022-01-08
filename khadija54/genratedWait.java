package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genratedWait {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebDriverWait mywait=new WebDriverWait(driver,5);

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        By elelocator =By.xpath("//h3[text()='Selenium']");
        waitforlementPresent(driver,elelocator,10).click();
    }
    public static WebElement  waitforlementPresent(WebDriver driver,By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                return driver.findElement(locator);
    }
}









