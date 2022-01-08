package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Hundlingwindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='main']")).click();
        Set <String> windowHandles=driver.getWindowHandles();
        System.out.println(windowHandles);
        Iterator<String> its=windowHandles.iterator();
        String parentWindows=its.next();
        String childWindows=its.next();
        driver.switchTo().window(childWindows);
        driver.findElement(By.name("UserFirstName")).sendKeys("Khadija");
        driver.findElement(By.name("UserLastName")).sendKeys("Rasikh");
        driver.switchTo().window(parentWindows);
    }}
