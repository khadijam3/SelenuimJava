package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        int slider = driver.findElements(By.tagName("a")).size();
        System.out.println(slider);
        int image=driver.findElements(By.className("homeslider-container")).size();
        System.out.println(image);

    }
}
