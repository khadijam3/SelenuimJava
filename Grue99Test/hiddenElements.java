package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/h1[2]/a")).click();
        driver.findElement(By.id("hide-textbox")).click();

        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('displayed-text').value='khadija';");
        //driver.quit();

    }}