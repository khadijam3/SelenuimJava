package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");
        //WebElement userName= driver.findElement(By.cssSelector("input#email"));//optional

        WebElement SignInB= driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        SignInB.click();
       WebElement LoginB = driver.findElement(By.id("login-google-button"));
        LoginB.click();
        driver.switchTo().frame(0);
        WebElement userName = driver.findElement(By.xpath("Email or phone"));
        userName.sendKeys("habibi.khadijarasikh55@gmail.com");
        WebElement password = driver.findElement(By.id("login-password-input"));
        password.sendKeys("Yesyes@123");
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.id("login-submit-button]"));
        loginBtn.click();
        WebElement employeebox = driver.findElement(By.id("typeaheadInput"));
        employeebox.sendKeys("Software Test Engineer");
        WebElement CountryBox = driver.findElement(By.id("google-location-search"));
        CountryBox.clear();
        CountryBox.sendKeys("Washington DC");
        WebElement searchBtn=driver.findElement(By.id("submitSearch-button"));
        searchBtn.click();

}}
