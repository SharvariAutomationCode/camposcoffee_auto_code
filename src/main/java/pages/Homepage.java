package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaitHandle;

public class Homepage extends WebTestBase {

    @FindBy(xpath = "//button[@title='Close']")
    WebElement closedFirstAd;

    @FindBy(xpath = "//a[@class = 'newsletter__close newsletter__trigger']")
    WebElement closedSecondAd;

    @FindBy(xpath = "//a[@class ='user-controls__ul__li__a']")
    WebElement loginBtn;

    public Homepage(){
        PageFactory.initElements(driver, this); //interview question
    }

    public void  closedAd(){

        WaitHandle.waitUntilElementToBeClickable(closedFirstAd);
        WaitHandle.waitUntilElementToBeClickable(closedSecondAd);
        WaitHandle.waitUntilElementToBeClickable(loginBtn);

    }


}
