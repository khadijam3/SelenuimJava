package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testUrl {
    public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2f");
         WebElement Username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
         Username.sendKeys("Tester");
         WebElement Password=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
         Password.sendKeys("test");
         WebElement login =driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
         login.click();
         Thread.sleep(2000);
         driver.close();

    }
}
