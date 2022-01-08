package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dinamictable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx;");

                WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
                username.sendKeys("Tester");
                WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
                password.sendKeys("test");
                Thread.sleep(2000);
                WebElement loginButton = driver.findElement(By.className("button"));
                loginButton.click();
}}