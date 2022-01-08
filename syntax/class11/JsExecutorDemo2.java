package syntax.class11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo2 {

    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();;
        driver.get(url);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -700)");
        WebElement backtotop=driver.findElement(By.linkText("Back to top"));
        js.executeScript("argument[0].scrollIntoView(true)",backtotop);



//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0, 500)");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0, -500)");
//
//        WebElement backToTop = driver.findElement(By.xpath("//span[contains(text(), 'Back to top')]"));
//        js.executeScript("arguments[0].scrollIntoView(true)", backToTop);
    }

}
