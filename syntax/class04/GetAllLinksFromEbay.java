package syntax.class04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllLinksFromEbay {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://ebay.com");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("shoes");
        driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
        driver.findElement(By.xpath("//*[@id='srp-river-results']")).click();
        driver.findElement(By.xpath("//input[@id='qtyTextBox']")).sendKeys("2");
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=msku-sel-1]"));
        Select select=new Select(dropdown);
         select.selectByValue("3");
        driver.findElement(By.xpath("//input[@id='qtyTextBox']")).sendKeys("2");
//        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//        System.out.println("Number of links " +  allLinks.size());
//
//        for(WebElement link: allLinks) {
//            String fullLink = link.getAttribute("href");
//            String linkText = link.getText();
//            if(!linkText.isEmpty()) {
//                System.out.println(linkText + "      " + fullLink);
//*[@type='text']
                //*[@id='gh-btn']
            }
        }



