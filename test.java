import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
    public static void main(String[] args) throws InterruptedException {


     WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
        driver.get("http://www.flipkart.com");

        //Write the search term - Buddha in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Buddha");

        //Click on searchButton
        WebElement searchButton = driver.findElement(By.xpath("///*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg"));
        searchButton.click();

        //Inserting an optional wait of 3 seconds just to notice scroll down event
        Thread.sleep(3000);

        //Scroll down the webpage by 2500 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 2500)");

        //Optional Wait
        Thread.sleep(3000);
    }
    }




