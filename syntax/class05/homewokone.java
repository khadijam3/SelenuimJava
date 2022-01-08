package syntax.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homewokone {
    public static String url="https://www.facebook.com/";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement createButton=driver.findElement(By.linkText("//a[@id='u_0_2_DI']"));
        createButton.click();
    }
}
