package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class khadija {

    public static String Url="https://www.automationtestinginsider.com/2019/08/student-registration-form.html";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(Url);
//             WebElement radioBotton = driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
//             radioBotton.click();
//            Thread.sleep(2000);
//            System.out.println("Male radio button is selected  " + radioBotton.isSelected());

//        WebElement checkBoxButton =driver.findElement(By.xpath("//input[@type='checkbox' and @value='Drawing']"));
//        checkBoxButton.click();
//        System.out.println("is the check box is selected"+ checkBoxButton.isSelected());
//        Thread.sleep(2000);

        List<WebElement> list =driver.findElements(By.xpath("//input[@name ='Hobby']"));
        System.out.println(list.size());
      for( WebElement lists:list){
          lists.click();


      }
////            WebElement ele=list.get(i);
////          String hobbies=ele.getAttribute("value");

//
//
//         Thread.sleep(2000);
////            if (hobbies.contains("Sketching")){
////                ele.click();
////
////                break;
////            }
//        }
}}
