package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageobjects.locators.AboutPageLocators.AboutButton;

public class AboutPage extends BasePageObject {

    public AboutPage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public AboutPage clickAboutButton(){
        waiter.until(ExpectedConditions.elementToBeClickable(AboutButton));
        driver.findElement(AboutButton).click();
        return this;
    }
}
