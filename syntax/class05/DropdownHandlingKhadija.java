package syntax.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandlingKhadija {
    public static String Url="https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(Url);
        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement selectionButton = driver.findElement(By.name("dropdown"));
        Select dropdown = new Select(selectionButton);
        dropdown.selectByVisibleText("Automation Testing");
        dropdown.selectByIndex(4);
        dropdown.selectByValue("ddmanual");
        dropdown.selectByVisibleText("QTP");
        dropdown.selectByIndex(3);
        // dropdown.selectByValue("msagile");
        // dropdown.deselectByValue("msagile");
        List<WebElement> alloptions = dropdown.getOptions();
        int size = alloptions.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String optionText = alloptions.get(i).getText();
            System.out.println(optionText);
            Thread.sleep(2000);
        }
    }
    }

