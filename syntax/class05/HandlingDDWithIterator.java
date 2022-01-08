package syntax.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {

    public static String url = "http://amazon.com";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);
        boolean isMultiple = select.isMultiple();
        if(!isMultiple) {
            List<WebElement> options = select.getOptions();
            Iterator<WebElement> it = options.iterator();
            while(it.hasNext()) {
                WebElement ddOption = it.next();
                String optionText = ddOption.getText();
                System.out.println(optionText);
            }
        }
    }
}
