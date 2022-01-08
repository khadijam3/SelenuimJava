package utils;

import org.openqa.selenium.WebElement;
import testBese.testClass;

public class CommonMethods extends testClass {
        public void clickOnWebElement(){

        }
        /**
         *This method clear text or textbox
         * @param element
         * @param text
         */
        public void sendText(WebElement element,String text){
                element.clear();
                element.sendKeys(text);


        }


        }







