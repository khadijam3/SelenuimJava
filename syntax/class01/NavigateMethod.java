package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        driver.manage().window().maximize();
       WebElement Ifrma1 =driver.findElement(By.id("iframeResult"));
       // driver.switchTo().frame(0);
        //driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(Ifrma1);
        driver.findElement(By.xpath("/html/body/button")).click();
        String  alertText =driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

        //driver.quit(); // will quit the whole browser
        //driver.close(); // will close the current tab
    }
}
