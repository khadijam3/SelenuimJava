package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@id='searchbox']/input[4]")).sendKeys("Summer dress");
        driver.findElement(By.id("search")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()");
    }}
