package util;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;

public class WebElementUtil extends WebTestBase {

   public static  String getTextOfElement(WebElement element){
       return element.getText();
   }

}
