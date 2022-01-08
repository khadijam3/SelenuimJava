package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testSelenium {
    public static String url = "http://www.uitestpractice.com/";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
        home.click();
        WebElement form = driver.findElement(By.linkText("Form"));
        form.click();
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Khadija");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("Rasikh");
        WebElement radioB = driver.findElement(By.xpath("//input[@name='optradio']"));
        radioB.click();
        WebElement Dancing = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[2]"));
        Dancing.click();
        WebElement reading = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]"));
        reading.click();
    }


}
