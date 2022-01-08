package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
    public static String Url="http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(Url);
        WebElement HomePageB=driver.findElement(By.id("search"));
        HomePageB.sendKeys("khadija54");
    }
}
