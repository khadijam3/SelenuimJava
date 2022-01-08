package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileHundle {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver =new ChromeDriver();
            driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
            WebElement browse =driver.findElement(By.id("uploadfile"));
            browse.sendKeys("D:/SoftwareTestingMaterial/UploadFile.txt");
            driver.close();
    }
}
