package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebtable {
    public static String url="https://www.seleniumeasy.com/test";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        WebElement box=driver.findElement(By.id("at-cv-lightbox-inner"));
        box.click();
        WebElement frame=driver.findElement(By.xpath("//*[@id='easycont']"));
        driver.switchTo().frame(frame);
        WebElement table=driver.findElement(By.xpath("//*[text()='Table']"));
        table.click();

    }
}
