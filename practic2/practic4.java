package practic2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practic4 {
    public static void main(String[] args) {
//       1 Launch new browser
//       2 Open URL https://itera-qa.azurewebsites.net/home/automation
//       3 Select the "Norway" from for category "Where do you plan to travel this year?" (Use select method.)
//       4 Close browser
//
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get ("https://itera-qa.azurewebsites.net/");
        driver.findElement(By.linkText("Test Automation")).click();
        Select select=new Select(driver.findElement(By.className("custom-select")));
        select.selectByVisibleText("Norway");
        select.selectByIndex(5);
        select.selectByValue("4");
        //driver.close();
    }
}
