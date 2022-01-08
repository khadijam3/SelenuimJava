package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class autoDropdownhundle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        WebElement searchFlight=driver.findElement(By.xpath("//input[@placeholder='From' and @type='text']"));
        searchFlight.sendKeys("Sydney");
        Thread.sleep(2000);
       searchFlight.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
       searchFlight.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
}
}
