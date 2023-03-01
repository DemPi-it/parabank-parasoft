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
    private final By personalAccount = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
    private final String expectedPersonalAccount = "Accounts Overview";
    private final By balanceXpath = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[2]/td[2]/b");
    private final String expectedBalance = "$515.50";
    private final String username = "demo";
    private final String password = "demo123";

    @Test
    public void loginTest(){
        driver.get(URL);
        driver.findElement(usernameForm).sendKeys(username);
        driver.findElement(passwordForm).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        String currentBalance = driver.findElement(balanceXpath).getText();
        Assertions.assertEquals(expectedPersonalAccount, driver.findElement(personalAccount).getText());
        Assertions.assertEquals(expectedBalance, currentBalance);
    }
}
