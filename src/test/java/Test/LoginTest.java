package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetup(){
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void successfulLogin() throws InterruptedException {
        loginPage.insertUsername();
        Thread.sleep(3000);
        loginPage.insertPassword();
        Thread.sleep(3000);
        loginPage.clickOnLoginButton();
        Assert.assertTrue(logoutPage.getLogoutButton().isDisplayed());
    }

    @Test
    public void wrongUsername(){
        loginPage.insertWrongUser();
        loginPage.insertPassword();
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.getWrongUserPassMessage().isDisplayed());
    }

    @Test
    public void wrongPassword(){
        loginPage.insertUsername();
        loginPage.insertWrongPassword();
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.getWrongUserPassMessage().isDisplayed());
    }

}
