package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClassPractice {
        public static String url="https://www.seleniumeasy.com/test/basic-first-form-demo.html";
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
            WebElement box =driver.findElement(By.id("at-cv-lightbox-inner"));
            box.click();
            Actions actions=new Actions(driver);
            WebElement table =driver.findElement(By.xpath("//a[text()='Table']"));
            actions.moveToElement(table).click().build().perform();


        }
    }






