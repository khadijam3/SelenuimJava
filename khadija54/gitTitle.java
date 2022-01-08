package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        String title= driver.getTitle();
      if(title.equals("Google")) {
          System.out.println("that is right");
      }  else{
          System.out.println("the title is wrong");
      }








    }
}
