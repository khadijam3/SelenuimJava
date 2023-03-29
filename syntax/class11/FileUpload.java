package syntax.class11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static String url = "https://the-internet.herokuapp.com/";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement uploadFile=driver.findElement(By.linkText("File Upload"));
        uploadFile.click();
       WebElement ChooseFile=driver.findElement(By.id("file-upload"));
       ChooseFile.sendKeys("C:/Users/rasik/Downloads/pic.JPG");
       //WebElement submit=driver.findElement(By.id("file-submit"));
       //submit.click();
//        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
//        fileUploadLink.click();
//
//        WebElement chooseFile = driver.findElement(By.id("file-upload"));
//        chooseFile.sendKeys("");
//        WebElement uploadButton = driver.findElement(By.id("file-submit"));
//        uploadButton.click();
    }
}
