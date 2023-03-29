package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navgateTOdiceAndAddcv {
    public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.dice.com");
    driver.manage().window().maximize();
        WebElement loginrajester = driver.findElement(By.xpath("//a[@id='navbarDropdown-10']"));
      loginrajester.click();

        WebElement LoginB = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
        LoginB.click();
        // Find the email field and enter the email address
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("habibi.khadijarasikh55@gmail.com");

        // Find the password field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Yesyes@123");

        // Find the login button and click it
        WebElement loginSubmit = driver.findElement(By.xpath("//*[@id='loginDataSubmit']/div[3]/div/button"));
        loginSubmit.click();

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Dashboard"));

        // Find the CV upload button and click it
        WebElement profile = driver.findElement(By.xpath("//*[@id='profileLink']/i"));
        profile.click();
        WebElement cvUploadButton = driver.findElement(By.linkText("//*[@id='dhi-candidates-form-field_TsjfUZiI8q_input']/div/div/a[2]"));
        cvUploadButton.click();
        // Find the CV file input field and enter the path of the CV file
        WebElement cvFileInput = driver.findElement(By.xpath("//*[@id='dhi-candidates-form-field_gKV-6h2XlI_input']/div/div/a[2]"));
        cvFileInput.sendKeys("C:/Users/rasik/Downloads/khadija resume/Khadija HRasikh Software AQ tester2");

        // Find the CV upload button and click it
        WebElement cvUploadSubmit = driver.findElement(By.id("submitCV"));
        cvUploadSubmit.click();

        // Close the browser

}}
