package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
        // find the element for try on button where create alert
        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        Thread.sleep(2000);
        // create alert object get the text from alert and print in counsel or accept or dismiss
        Alert alert = driver.switchTo().alert();
        String print = alert.getText();
        System.out.println(print);
        alert.accept();
        //driver.findElement(By.xpath("//*[@id='content']/button")).click();
        //alert.dismiss();
        driver.close();


    }

}
