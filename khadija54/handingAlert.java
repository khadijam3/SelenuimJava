package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handingAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
//        // simple you can get text and accept
//        //simpleAlert.accept();
//        WebElement confirmationAlert=driver.findElement(By.id("confirm"));
//        confirmationAlert.click();
//        Thread.sleep(2000);
//        //confrimationAlert is get text and dismiss or accept
//        Alert confrimationAlert=driver.switchTo().alert();
//         String confirmation =confirmationAlert.getText();
//         System.out.println(confirmation);
//         confrimationAlert.dismiss();
// prompt Alert
        WebElement promptAlert=driver.findElement(By.id("prompt"));
               Alert promptA=driver.switchTo().alert();
               Thread.sleep(2000);
               promptAlert.sendKeys("khadija54");
               promptA.accept();





    }
}
