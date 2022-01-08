package khadija54.webHundleExm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
    public static String url="http://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    String mainPageHandle= driver.getWindowHandle();
        System.out.println(mainPageHandle);
//        WebElement help=driver.findElement(By.linkText("Help"));
//        help.click();
//        Thread.sleep(2000);
//        WebElement privacyTab=driver.findElement(By.linkText("Privacy"));
//        privacyTab.click();
//        Thread.sleep(2000);
//        Set<String> allWindowsHandle=driver.getWindowHandles();
//        System.out.println(allWindowsHandle.size());
//        Thread.sleep(2000);
//        driver.switchTo().window(mainPageHandle);
//        //driver.close();
//        driver.quit();


}}

