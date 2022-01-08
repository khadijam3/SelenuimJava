package syntax.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HadnlingMultipleDD {

    public static String url = "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement multipleSelect = driver.findElement(By.name("multipleselect[]"));
        Select multipleDD = new Select(multipleSelect);
        boolean isMultiple = multipleDD.isMultiple();
        System.out.println(isMultiple);

        if(isMultiple) {
           List<WebElement> options = multipleDD.getOptions();
           for(WebElement option: options) {
               String optionText = option.getText();
               multipleDD.selectByVisibleText(optionText);
               Thread.sleep(1000);
           }
        }
        //multipleDD.deselectByIndex(3);
        //multipleDD.deselectAll();
    }
}
