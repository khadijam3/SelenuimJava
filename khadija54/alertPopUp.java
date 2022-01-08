package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
            driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
            driver.findElement(By.xpath("//*[@id='content']/button")).click();
            Alert alert=driver.switchTo().alert();
            String print=alert.getText();
             System.out.println(print);
           alert.accept();
          driver.findElement(By.xpath("//*[@id='content']/button")).click();
           alert.dismiss();
           driver.close();





        }

    }
