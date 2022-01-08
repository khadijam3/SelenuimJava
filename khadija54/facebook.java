package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class facebook {

        public static String url="http://facebook.com";
        public static void main(String[] args) throws IOException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver =new ChromeDriver();
            driver.get(url);
            String title= driver.getTitle();
            System.out.println(title);
            //WebElement CreateAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
            //CreateAccount.click();
            //CreateAccount1.sendKeys("khadija");
           // WebElement email=driver.findElement(By.id("email"));
           //email.sendKeys("khadija");
            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile,new File ("C:/Users/rasik/AppData/Local/Temp/screenshot1701980034062156289.png "));


    }
}
