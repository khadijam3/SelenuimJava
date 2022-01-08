package khadija54;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingTables {
    public static String url="file:///C:/Users/rasik/OneDrive/Desktop/khadija/table.html";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//         int rowdata=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
//        System.out.println(rowdata);
//        int col=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
//        System.out.println(col);
//        for (int i=2;i<=row;i++){
//            for (int j=1;j<=col;j++){
//                System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+ i +"]/td["+ j +"]")).getText()+" ");
//
//            }
//            System.out.println();
        List<WebElement>  rowdata=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        System.out.println(rowdata.size());
          Iterator<WebElement>it = rowdata.iterator();
        while (it.hasNext()) {
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);

        }

        System.out.println("=============");
       List<WebElement> Colsdata=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]"));
        System.out.println(Colsdata.size());
        for (WebElement Coldata:Colsdata){
            String colsData= Coldata.getText();
            System.out.println(colsData);
        }

        }
     }










