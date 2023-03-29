package Grue99Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndAddCustomers {
    public static String url = "http://www.demo.guru99.com/V4/";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        String title=driver.getTitle();
        System.out.println(title);
       WebElement UserName =driver.findElement(By.cssSelector("[name='uid']"));
      UserName.sendKeys("mngr392551");
        WebElement Password= driver.findElement(By.cssSelector(" [name='password']"));
        Password.sendKeys("sYdEtah");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.findElement(By.linkText("New Customer")).click();
        WebElement Name= driver.findElement(By.xpath("//input[@name='name']"));
        Name.sendKeys("khadija");
        WebElement radiobutton  = driver.findElement(By.xpath("//input[@value='f']"));
        radiobutton.click();
        WebElement caledertextbox= driver.findElement(By.id("dob"));
        caledertextbox.sendKeys("02132000");
        WebElement address = driver.findElement(By.xpath("//*[@name='addr']"));
       address.sendKeys("154345 washington street woodbridge");
        WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
        city.sendKeys("Dale City");
        WebElement States = driver.findElement(By.xpath("//*[@name='state']"));
        States.sendKeys("VA");
        WebElement pin = driver.findElement(By.xpath("//*[@name='pinno']"));
        pin.sendKeys("20192");
        WebElement phoneNum = driver.findElement(By.xpath("//*[@name='telephoneno']"));
        phoneNum.sendKeys("6172975423");
        WebElement email = driver.findElement(By.xpath("//*[@name='emailid']"));
        email.sendKeys("khadija@habibi@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys("Yesyes@123");
       // WebElement subBtn = driver.findElement(By.xpath("//input[@name='sub']"));
        WebElement resetBtn = driver.findElement(By.xpath("//input[@name='res']"));
        //subBtn.click();
        resetBtn.click();
        //input[@name='res']
        //input[@name='sub']
    }}