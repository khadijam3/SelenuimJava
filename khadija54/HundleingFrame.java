package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HundleingFrame {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement iframe = driver.findElement(By.id("name"));
        iframe.sendKeys("Khadija");
        driver.switchTo().defaultContent();
      WebElement alertButton=driver.findElement(By.id("alert"));
      alertButton.click();
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        iframe.clear();
        driver.switchTo().frame(iframeElement);
        iframe.sendKeys("syntax Teach");
    }
}