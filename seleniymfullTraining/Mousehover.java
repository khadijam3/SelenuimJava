package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
    public static void main(String[] args) throws InterruptedException {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
         WebElement element=driver.findElement(By.linkText("Clothing & Accessories"));
        Actions actions= new Actions(driver);
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
}}
