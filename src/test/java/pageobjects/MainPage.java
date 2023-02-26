package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

public class MainPage extends BaseSeleniumTest {
    private final By usernameForm = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    private final By passwordForm = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    private String username = "demo";
    private String password = "demo123";

    @Test
    public void loginTest(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(usernameForm).sendKeys(username);
        driver.findElement(passwordForm).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
}
