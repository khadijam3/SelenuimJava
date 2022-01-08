package seleniymfullTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resiziseableDemo {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/resizable/");
    driver.manage().window().maximize();
    WebElement iframe=driver.findElement(By.xpath("//*[@id='content']/iframe"));
    driver.switchTo().frame(iframe);
    WebElement element=driver.findElement(By.xpath("//*[@id='resizable']"));
    Actions actions= new Actions(driver);
    actions.dragAndDropBy(element,100,50).perform();
}}
