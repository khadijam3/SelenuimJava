package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElemntscommend {
        public static String Url="https://opensource-demo.orangehrmlive.com/p";
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get(Url);
            driver.findElement(By.id("txtUsername")) .sendKeys("Admin");
            Thread.sleep(2000);
            driver.findElement(By.id("txtUsername")) .clear();
//          driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//          driver.findElement(By.id("btnLogin")).click();
            String str=driver.findElement(By.linkText("Forgot your password?")).getText();
            System.out.println("the text link is ; " +str);
            Boolean d=driver.findElement(By.id("btnLogin")).isDisplayed();
            Boolean e=driver.findElement(By.id("btnLogin")).isEnabled();
            Boolean s=driver.findElement(By.id("btnLogin")).isSelected();
            System.out.println("isDisplayed is "+ d);
            System.out.println("isEnabled is "+ e);
            System.out.println("isSelected is "+ s);
//            String id=driver.findElement(By.id("btnLogin")).getAttribute("id");
//            System.out.println("this the value of id" + id);



    }
}
