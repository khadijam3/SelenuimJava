package practic2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploudPrace6 {
    public static void main(String[] args) throws InterruptedException {
//       1 Launch new browser
//       2 Open URL http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html
//       3 browser button your file use find element by id  use sendkeys to uploud file
//       4 Click on Submit button (Use Name locator)
//       5 Close browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
         WebElement browser=driver.findElement(By.xpath("//input[@id='uploadfile']"));
         browser.sendKeys("C:/Users/rasik/Downloads/khadija resume/Khadija HRasikh Software AQ tester7.docx");
        driver.close();
    }
}
