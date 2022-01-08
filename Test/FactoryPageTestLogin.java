package Test;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.DushBoardPage;
import pages.LoginPageWithPageFactory;
import testBese.testClass;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class FactoryPageTestLogin  {
    public static void main(String[] args) throws IOException {
        testClass.SetWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory loginpagewithpagefactory=new LoginPageWithPageFactory();
        DushBoardPage dushBoardPage=new DushBoardPage();
        loginpagewithpagefactory.userNameTextBox.sendKeys("Admin");
        loginpagewithpagefactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginpagewithpagefactory.loginBtn.click();
        TakesScreenshot ts=(TakesScreenshot)testClass.driver;
        File sourceFile= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("Screenshots/HRMS/Dushboard.png"));
        String welcomeText=dushBoardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);
        testClass.Teardown();
    }

}