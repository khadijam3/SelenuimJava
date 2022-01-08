package khadija54.webHundleExm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class classWHundles {
    public static String url="https://www.sugarcrm.com/";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        // Load the website
        driver.get(url);
//driver.manage().window().maximize();

    // It will return the parent window name as a String
    String parent=driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[1]/div[4]/a")).click();
        Set<String> windowsHundles=driver.getWindowHandles();
        System.out.println(windowsHundles);
        driver.switchTo().window(parent);




    }

}


