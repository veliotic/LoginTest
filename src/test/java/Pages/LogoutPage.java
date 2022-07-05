package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
             WebDriver driver;
            WebDriverWait wdwait;
             WebElement logoutButton;

    public LogoutPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
    }
}
