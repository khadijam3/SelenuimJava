package syntax.class11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo3 {

    public static String url = "http://google.com";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();;
        driver.get(url);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open();");
        WebElement searchbtn=driver.findElement(By.name("q"));
        searchbtn.sendKeys("khadija54");



//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.open();");
//        driver.get(url);
//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("adfahdfkajlfakfadjfa");
    }
}
