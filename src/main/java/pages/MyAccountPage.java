package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebElementUtil;

public class MyAccountPage  extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;




    public MyAccountPage() { PageFactory.initElements(driver, this);
    }

    //public String getTextOfMyAccount() {
        //return WebElementUtil.getTextOfElement(myAccountText);



    }


