package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
//          WebDriverManager.firefoxdriver().setup();
//          WebDriver driver=new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement Username=driver.findElement(By.id("txtUsername"));
        Username.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        Thread.sleep(2000);
        WebElement Login=driver.findElement(By.id("btnLogin"));
        Login.click();
        Thread.sleep(2000);
        driver.close();


}



    }


