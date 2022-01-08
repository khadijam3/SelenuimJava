package Test;

import pages.LoginPage;
import testBese.testClass;

public class LoginTest {
    public static void main(String[] args) {

        testClass.SetWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();
        testClass.Teardown();

    }
}


