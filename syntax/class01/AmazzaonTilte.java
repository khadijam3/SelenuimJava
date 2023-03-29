package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazzaonTilte {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com");
        //driver.manage().window().fullscreen();
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        Thread.sleep(2000);
        String Title = driver.getTitle();
        System.out.println(Title);

    }}