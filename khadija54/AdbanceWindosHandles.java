package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdbanceWindosHandles {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPage = driver.getWindowHandle();
        String mainPageHandle = driver.getWindowHandle();
        // WebElement helpPage=driver.findElement(By.linkText("Help"));
        WebElement helpPage = driver.findElement(By.xpath("//*[@class='Bgzgmd']/li/a"));
        WebElement privacyPage = driver.findElement(By.linkText("Privacy"));
        WebElement termsPage = driver.findElement(By.linkText("Terms"));
        helpPage.click();
        privacyPage.click();
        termsPage.click();


     Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows.size());
        Iterator<String> itr=allWindows.iterator();
       while (itr.hasNext()) {
         String handle = itr.next();
           if(!handle.equals(mainPageHandle)) {
              driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
              driver.close();
           }
        }
        driver.switchTo().window(mainPageHandle);//switch back to parnat and child
    helpPage.click();
    }
}
