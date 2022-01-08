package syntax.class11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='yellow'",password);
        js.executeScript("arguments[0].style.backgroundColor='yellow'",username);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",loginButton);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].style.backgroundColor='red'", password);
//
//        Thread.sleep(2000);
//        js.executeScript("arguments[0].click()", loginButton);
    }
}
