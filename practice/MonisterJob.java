package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MonisterJob {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monster.com/");
       Thread.sleep(2000);
         driver.findElement(By.linkText("Find Jobs")).click();
        WebElement searchbox =driver.findElement(By.xpath("//*[@id='horizontal-input-one-283acae6-0140-43b9-9bd6-1dfad593c325']"));
          searchbox.sendKeys("Software tester");

    }}

