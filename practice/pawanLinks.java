package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class pawanLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        String mainWindow=driver.getWindowHandle();
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.linkText("Dresses")).click();
        Set<String> allwebHandles=driver.getWindowHandles();
        System.out.println(allwebHandles.size());
//        WebElement searchBox =driver.findElement(By.name("submit_search"));
//        searchBox.click();
////      driver.findElement(By.linkText("Printed Chiffon Dress")).click();
//        driver.findElement(By.partialLinkText("Printed")).click();
//        driver.findElement(By.className("homeslider-description"));
    }


}