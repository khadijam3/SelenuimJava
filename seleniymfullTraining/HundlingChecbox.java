package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HundlingChecbox {
    public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement Radio=driver.findElement(By.id("interest_market_c0"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Radio).perform();
        driver.findElement(By.id("interest_market_c0")).click();
        driver.findElement(By.id("interest_sell_c0")).click();
       driver.findElement(By.id("interest_serve_c0")).click();
       driver.findElement(By.id("interest_serve_c0")).click();
        boolean selectedKeys=driver.findElement(By.id("interest_sell_c0")).isSelected();
        System.out.println(selectedKeys);
        boolean selectedK=driver.findElement(By.id("interest_serve_c0")).isSelected();
        System.out.println(selectedK);
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());



}}
