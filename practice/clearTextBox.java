package practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearTextBox {
    public static String Url= "http://facebook.com";
    public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get(Url);
     WebElement Username=driver.findElement(By.xpath("//*[@id='email']"));
     Username.sendKeys("khadija.rhabibi@gmail.com");
     WebElement Password=driver.findElement(By.xpath("//*[@id='pass']"));
     Password.sendKeys("yesyes@123");
     Thread.sleep(2000);
     Username.clear();
     Password.clear();
}}