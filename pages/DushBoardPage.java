package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DushBoardPage extends CommonMethods {
    @FindBy(id="welcome")
    public WebElement welcomeAdmin;
    public DushBoardPage(){
        PageFactory.initElements(driver,this);
    }
}
