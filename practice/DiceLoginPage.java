package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

public class DiceLoginPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dice.com");
        //WebElement userName= driver.findElement(By.cssSelector("input#email"));//optional

        WebElement Loginrejister = driver.findElement(By.linkText("Login/Register"));
        Loginrejister.click();
        WebElement LoginB = driver.findElement(By.linkText("Login"));
        LoginB.click();
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("habibi.khadijarasikh55@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Yesyes@123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='loginDataSubmit']/div[3]/div/button"));
        loginBtn.click();
        WebElement employeebox = driver.findElement(By.id("typeaheadInput"));
       employeebox.sendKeys("Software Test Engineer");
        WebElement CountryBox = driver.findElement(By.id("google-location-search"));
       CountryBox.clear();
       CountryBox.sendKeys("Washington DC");
       WebElement searchBtn=driver.findElement(By.id("submitSearch-button"));
       searchBtn.click();
    }}