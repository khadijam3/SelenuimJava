package syntax.class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("web orders")) {
            System.out.println("Title is Correct");
        } else {
            System.out.println("Title is WRONG");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
