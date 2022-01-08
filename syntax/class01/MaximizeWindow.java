package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

    public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        driver.navigate().back();

    }
}
