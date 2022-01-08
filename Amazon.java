import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("nail polish");
        driver.findElement(By.xpath("//*[@id='nav-flyout-searchAjax']")).click();
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();

    }}

