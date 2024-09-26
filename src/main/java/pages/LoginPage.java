package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaitHandle;
import util.WebElementUtil;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement usernameTextBox;


    @FindBy(id = "password")
    WebElement passwordTextBox;


    @FindBy(xpath = "//input[@name='login']")
    WebElement loginBtn;

    //@FindBy(xpath = "//strong[Text()='Error']")
    //WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    } //interview question

    public void setLogin(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        WaitHandle.waitUntilElementToBeClickable(loginBtn);

    }

    //public String getTextOfError() {
        //return WebElementUtil.getTextOfElement(errorMessage);

}
