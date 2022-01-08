package practic2;

import com.sun.xml.internal.bind.util.Which;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 {
//   1 Launch new browser
//   2 Open URL https://itera-qa.azurewebsites.net/home/automation
//   3 Select the Radio button (2 years) for category Years of experience in test automation (Find elements by using Xpath method.)
//   4 Check the Check Box ‘Selenium Webdriver’ and TestNG for category ‘
//   5 Which automation tools/frameworks do you use?'(Find elements by using Xpath method)
//   6 Close browser
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/");
        driver.findElement(By.linkText("Test Automation")).click();
        driver.findElement(By.xpath("//label[@for='2years']")).click();
        driver.findElement(By.xpath("//label[@for='selenium']")).click();
        driver.findElement(By.xpath("//label[@for='testng']")).click();
    }
}
