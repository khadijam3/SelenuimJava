package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploudFile {
    public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/rasik/Downloads/pic.JPG");
}}
