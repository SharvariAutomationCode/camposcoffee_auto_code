package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectUtil {

    public static Select select;

    public static void selectDropDown(WebElement element, String value, String option) {
        select = new Select(element);
        if (option.equalsIgnoreCase("SelectByVisibleText")) {
            select.deselectByVisibleText(value);
        } else if (option.equalsIgnoreCase("selectByValue")) {
            select.selectByValue(value);
        } else {
            throw new RuntimeException("Select the Correct Dropdown Option");
        }

    }

    public static void selectDropDown(WebElement element, int index ) {
        select = new Select(element);
        select.selectByIndex(index);

    }
    public static String getAllDropDownsOption(WebElement element) {
        select = new Select(element);
        String text = null;
        List<WebElement> allElements = select.getOptions();
        for (WebElement e : allElements) {
            e.getText();
        }
        return text ;



    }


}