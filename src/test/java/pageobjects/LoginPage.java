package pageobjects;

import enums.XpathForLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {
    public LoginPage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public LoginPage login(String username, String password){
        driver.findElement(By.xpath(XpathForLogin.LoginXpath.getXpath())).sendKeys(username);
        driver.findElement(By.xpath(XpathForLogin.PasswordXpath.getXpath())).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton(){
        driver.findElement(By.xpath(XpathForLogin.ButtonXpath.getXpath())).click();
        return this;
    }
}
