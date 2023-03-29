package syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

        public static void main(String[] args) {
            // Set the path of the ChromeDriver executable
            WebDriverManager.chromedriver().setup();


            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to Google
            driver.get("https://www.google.com");

            // Find the search box element by its name
            WebElement searchBox = driver.findElement(By.name("q"));

            // Enter a search term in the search box
            searchBox.sendKeys("selenium testing");

            // Submit the form
            searchBox.submit();

            // Close the browser
            driver.quit();
        }
    }


