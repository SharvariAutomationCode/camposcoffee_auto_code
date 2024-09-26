package Testcases;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Homepage;
import pages.LoginPage;
import pages.LostYourPasswordPage;
import pages.MyAccountPage;

public  class LoginTest extends WebTestBase {

    public Homepage homepage;
    public LoginPage loginPage;
    public LostYourPasswordPage LostYourPasswordPage;
    public MyAccountPage myAccountPage;


    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void preRequsite() {
        initialization();
        homepage = new Homepage();
        loginPage = new LoginPage();
        LostYourPasswordPage = new LostYourPasswordPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify login with valid username and password")
    public void verifyLoginWithValidUsernameValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homepage.closedAd();
        loginPage.setLogin(props.getProperty("username"), props.getProperty("password"));
         //String text = myAccountPage.getTextOfMyAccount();
        //softAssert.assertEquals(text,  "My ACCOUNT"  , "My ACCOUNT text should be match");
        //softAssert.assertAll();
        //softAssert.assertEquals(loginPage.getTextOfError(), "ERROR" , "ERROR Text should be match");
        //softAssert.assertAll();

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}


