package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
         WebElement ddown=driver.findElement(By.name("employees_c"));
        Select select= new Select(ddown);
        select.selectByValue("level3");
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);
        select.selectByVisibleText("11 - 50 employees");
        Thread.sleep(2000);
    }
}