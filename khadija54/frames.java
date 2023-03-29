package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class frames {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

                driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.


    }
}
