package practic2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class itraTest {
    public static void main(String[] args) throws InterruptedException {
//       1 Launch new browser
//       2 Open URL https://itera-qa.azurewebsites.net/home/automation
//       3 Type Name, Mobile number, Email address, Password, Address (Use ID locator )
//       4 Click on Submit button (Use Name locator)
//       5 Close browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
          driver.get ("https://itera-qa.azurewebsites.net/");
        driver.findElement(By.linkText("Test Automation")).click();
        driver.findElement(By.id("name")).sendKeys("khadija");
        driver.findElement(By.id("phone")).sendKeys("61765415243");
        driver.findElement(By.id("email")).sendKeys("khadija.rhabibi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Yesyes@123");
        driver.findElement(By.id("address")).sendKeys("232 victor house");
        Thread.sleep(2000);
       driver.findElement(By.name("submit")).click();
       driver.close();
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("thursday")).click();
        driver.findElement(By.id("friday")).click();
         Select select=new Select(driver.findElement(By.className("custom-select")));
         //select.selectByVisibleText("Italy");
         //select.selectByIndex(5);
         select.selectByValue("5");
    }
}
