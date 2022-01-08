package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUpbrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");

       driver.findElement(By.xpath("//*[@id='menu-item-7640']/a/span")).click();
        WebElement selenium=driver.findElement(By.linkText("Selenium"));

        selenium.click();
        driver.close();


    }

}
