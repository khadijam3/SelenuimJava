package syntax.class11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions {

    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightclick).perform();
        WebElement editButton=driver.findElement(By.xpath("//span[text()='Edit']"));
        editButton.click();
        actions.click(editButton);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement doubleClick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        actions.doubleClick(doubleClick).perform();
        System.out.println(alert.getText());
        alert.accept();
//        WebElement rightClickButton = driver.findElement(By.xpath("//span[@text()='right click me']"));
//        Actions action = new Actions(driver);
//        action.contextClick(rightClickButton).perform();
//        Thread.sleep(1000);
//       WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit'] "));
//       editOption.click();
//        action.click(editOption).perform();

//
//        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
//        action.doubleClick(doubleClickButton).perform();
//        System.out.println(alert.getText());
//        alert.accept();


    }
}
