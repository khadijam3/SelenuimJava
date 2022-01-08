package practic2;

import com.sun.xml.internal.bind.util.Which;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
//      1  Launch new browser
//      2  Open URL https://itera-qa.azurewebsites.net/home/automation
//      3  Select the Gender(Use ID locator)
//      4  Check the Check Box "Tuesday" and "Friday" for category ‘Which days of the week are best to start something new?'(Use ID locator)
//      5  Close browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/");
        driver.findElement(By.linkText("Test Automation")).click();
       // driver.findElement(By.id("female")).click();
        //driver.findElement(By.id("monday")).click();
        List<WebElement> radiobtn=driver.findElements(By.xpath("//label[@id='monday']"));
        for (WebElement radio:radiobtn){
            String value=radio.getAttribute("value");
            if(radio.isEnabled()&& value.equals("thursday")){
                radio.click();
                break;
            }
        }

        //driver.close()

}}
