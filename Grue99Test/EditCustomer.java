package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditCustomer {
    public static String url = "http://www.demo.guru99.com/V4/";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement UserName = driver.findElement(By.cssSelector("[name='uid']"));
        UserName.sendKeys("mngr392551");
        WebElement Password = driver.findElement(By.cssSelector("[name='password']"));
        Password.sendKeys("sYdEtah");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("Edit Customer")).click();
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys( "Khadija");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
}}
