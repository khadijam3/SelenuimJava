package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.Rows;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Guru99varifyTabs {
    public static String url = "http://www.demo.guru99.com/V4/";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        userName.sendKeys("mngr408595");
        WebElement pass=driver.findElement(By.xpath("//input[@name ='password']"));
        pass.sendKeys("suzydEh");
        WebElement Loginb=driver.findElement(By.xpath("//input[@type='submit']"));
        Loginb.click();
       List<WebElement> Rows=driver.findElements(By.xpath("/html/body/div[3]/div/ul"));

        for(int i = 0; i<= Rows.size(); i++){
            String expected=Rows.get(i).getText();
            System.out.println(expected);

        }


}}
