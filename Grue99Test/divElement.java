package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class divElement {

    public static void main(String[] args) throws InterruptedException {
        String url="https://www.justdial.com/Bangalore/Bakeries";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //URL launch
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    // identify div elements with same class
    List<WebElement> l = driver.findElements(By.className("store-details"));
    // list iteration
      System.out.println("Elements are: ");
      for(int j = 0; j< l.size(); j++) {
        //identify separate div
        String v = l.get(j).getText();
        System.out.println("Elements are: ");
        System.out.println(v);
    }
    //browser close
      driver.close();
}
}

