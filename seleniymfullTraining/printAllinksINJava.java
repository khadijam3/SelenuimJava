package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printAllinksINJava {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
        List <WebElement> alltaglinks=driver.findElements(By.tagName("a"));
        System.out.println(alltaglinks.size());
        for(int i=0; i<alltaglinks.size();i++){
            System.out.println("Links of page: "+ alltaglinks.get(i).getText());
            System.out.println("text on page: "+alltaglinks.get(i).getAttribute("href"));

        }

}}
