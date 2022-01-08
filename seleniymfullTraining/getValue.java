package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getValue {
public static String browser = "chrome";
    public static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("testing");
        driver.findElement(By.name("firstname")).clear();
        System.out.println(driver.findElement(By.name("firstname")).getAttribute("placeholder"));
        String cssValue=driver.findElement(By.xpath("//*[@id='field1']/div/input" )).getCssValue("background-color");
        System.out.println(cssValue);
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div/div/div/div/h2" )).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input" )).isSelected());

    }
        }
