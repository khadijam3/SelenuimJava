package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  CanvasSignUP {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://canvas.instructure.com/login/canvas");
        //WebElement userName= driver.findElement(By.cssSelector("input#email"));//optional
        WebElement userName= driver.findElement(By.id("pseudonym_session_unique_id"));
        userName.sendKeys("khadija.habibim4@gmail.com");
        WebElement Password= driver.findElement(By.id("pseudonym_session_password"));
        Password.sendKeys("Yesyes@123");
        WebElement LoginButton= driver.findElement(By.cssSelector("#login_form > div.ic-Login__actions > div.ic-Form-control.ic-Form-control--login > button"));
        LoginButton.click();
        WebElement popUpButton= driver.findElement(By.id("eesy-dark-screen"));
        popUpButton.click();
        Password.clear();
    }
}
