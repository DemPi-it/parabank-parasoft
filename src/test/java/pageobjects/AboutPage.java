package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

public class AboutPage extends BaseSeleniumTest {

    private final By aboutButton = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a");


    @Test
    public void aboutTest(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        waiter.until(ExpectedConditions.elementToBeClickable(aboutButton));
        driver.findElement(aboutButton).click();
        waiter.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"rightPanel\"]/h1"))));
        String aboutText = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        Assertions.assertEquals("ParaSoft Demo Website", aboutText);
    }
}
