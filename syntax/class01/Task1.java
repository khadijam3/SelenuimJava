package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        String Title=driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(url+""+Title);
        driver.quit();

    }

}
