package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
//        driver.get("https://www.google.com");
//
//       driver.findElement(By.name("q")).sendKeys("Selenium");
//       Thread.sleep(2000);
//      driver.findElement(By.xpath("/html/body")).isSelected();
//        Thread.sleep(2000);
//      driver.findElement(By.name("btnK")).click();
//        driver.get("https://www.google.com");
//        String Title=driver.getTitle();
//        System.out.println(Title);
//        driver.findElement(By.name("q")).sendKeys("Google maps");
//        driver.findElement(By.xpath("/html/body")).isSelected();
//        driver.findElement(By.name("btnK")).click();

        driver.get("https://www.facebook.com");
        String title= driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("email")).sendKeys("khadija.rhabibi@gamil.com");
        driver.findElement(By.id("pass")).sendKeys("yeayra@123");
        WebElement loginB = driver.findElement(By.id("//button[@name='login']"));
        loginB.click();



    }
}
