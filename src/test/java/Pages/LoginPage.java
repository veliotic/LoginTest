package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement logoutButton;
    WebElement wrongUserPassMessage;

    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }

    public WebElement getWrongUserPassMessage() {
        return driver.findElement(By.id("flash"));
    }

//----------------------------------------

    public void insertUsername() {
        this.getUsername().sendKeys("tomsmith");
    }

    public void insertPassword() {
        this.getPassword().sendKeys("SuperSecretPassword!");
    }

    public void clickOnLoginButton() {
        this.getLoginButton().click();
    }
    public void insertWrongUser(){
        this.getUsername().sendKeys("pogresni username");
    }
    public void insertWrongPassword(){
        this.getPassword().sendKeys("pogresni password");
    }
}
