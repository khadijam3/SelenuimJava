package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class dropDwanCheckBandredioBdemo {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //Launching application
        driver.get("https://automationexplore.com/selenium-automation-practice-page/");

        //Setting implicit wait to load all web elements in application
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Maximize the window
        driver.manage().window().maximize();
        //add  name find the id and sendkeys to write  the name
        WebElement firstname=driver.findElement(By.id("firstname"));
        firstname.sendKeys("khadija");
        WebElement lastname =driver.findElement(By.id("lastname"));
        lastname.sendKeys("khadij@123");
        WebElement emailbox =driver.findElement(By.id("email"));
        emailbox.sendKeys("khadija.ras@gmail.com");
        // WebElement rideobtn=driver.findElement(By.xpath("//input[@value='male']"));
        //rideobtn.click();
        WebElement rideobtn=driver.findElement(By.xpath("//input[@value='female']"));
        rideobtn.click();
        //Find element and assign in webelement
        WebElement workingCheckBox=driver.findElement(By.xpath("//input[@name='working']"));

        //clicking the element
        workingCheckBox.click();
        WebElement freelancercheckbox=driver.findElement(By.xpath("//input[@name='freelancer']"));
        freelancercheckbox.click();
        //validating check box is clicked or not?


        boolean status = workingCheckBox.isSelected();

        //confirming what is there in status for learning purpose otherwise no need
        System.out.println("Checking boolean status:"+status);

        //checking condition is true or not.
        if(status)
        {
            System.out.println("Working check box is selected sucessfully at profession.");

        }

        else
        {
            System.out.println("Working check box is not clicked at profession.");
        }
        //fine element for selection class store it in selecrion then perform action by using the object of select class
  WebElement dropdwon= driver.findElement(By.xpath("//select[@name='country']"));
        Select dds=new Select(dropdwon);
      dds.selectByVisibleText("Australia");
        WebElement manyselection= driver.findElement(By.id("skillsmultiple"));
        Select MS=new Select(manyselection);
        boolean selectionismultiple=MS.isMultiple();
        System.out.println(selectionismultiple);
        MS.selectByValue("MT");
        MS.selectByValue("AT");
        MS.selectByValue("ET");
        MS.deselectByVisibleText("ETL Testing");

    }
}









