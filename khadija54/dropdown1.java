package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class dropdown1 {
    public static String Url="http://www.naukri.com/";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(Url);

//        Thread.sleep(1000);
//        WebElement elementS = driver.findElement(By.name("dropdown"));
//        Select dropdown= new Select(elementS);
//        dropdown.selectByVisibleText("Selenium");
//        String firstSel=dropdown.getFirstSelectedOption().getText();
//        System.out.println(firstSel);

        driver.manage().window().maximize();
        // To open Naukri website with multiple windows

        // It will return the parent window name as a String
        String mainWindow=driver.getWindowHandle();
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set =driver.getWindowHandles();
        // Using Iterator to iterate with in windows
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            String childWindow=itr.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close.
            if(!mainWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());
                //driver.close();



            }
        }
        // This is to switch to the main window
        // driver.switchTo().window(mainWindow);
    }
}




