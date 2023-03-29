package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        WebElement LoginRejister = driver.findElement(By.xpath("//a[@id='navbarDropdown-10']"));
        LoginRejister.click();
        WebElement LoginB = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
        LoginB.click();
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("habibi.khadijarasikh55@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Yesyes@123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='loginDataSubmit']/div[3]/div/button"));
        loginBtn.click();
        WebElement profile = driver.findElement(By.xpath("//*[@id='profileLink']/i"));
        profile.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('txt').value='Upload New'");
        driver.findElement(By.linkText("Upload New")).sendKeys("C:/Users/rasik/Downloads/khadija resume/Khadija HRasikh Software AQ tester1.docx");

        //sendKeys("C:/Users/rasik/Downloads/khadija resume/Khadija HRasikh Software AQ tester1.docx ");
//        WebElement submit=driver.findElement(By.id("file-submit"));
//        submit.click();
//        WebElement employeebox = driver.findElement(By.id("typeaheadInput"));
//       employeebox.sendKeys("Software Test Engineer");
//        WebElement CountryBox = driver.findElement(By.id("google-location-search"));
//       CountryBox.clear();
//       CountryBox.sendKeys("Washington DC");
//       WebElement searchBtn=driver.findElement(By.id("submitSearch-button"));
//       searchBtn.click();
    }}