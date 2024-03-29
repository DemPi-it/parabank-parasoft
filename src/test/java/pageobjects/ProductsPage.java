package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

import static pageobjects.locators.ProductsPageLocators.acceptCookiesXpath;
import static pageobjects.locators.ProductsPageLocators.productsButton;

public class ProductsPage extends BasePageObject {
    public ProductsPage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public ProductsPage clickOnAcceptCookiesButton(){
        waiter.until(ExpectedConditions.elementToBeClickable(acceptCookiesXpath));
        driver.findElement(acceptCookiesXpath).click();
        return this;
    }

    public ProductsPage clickOnProductsLink(){
        waiter.until(ExpectedConditions.elementToBeClickable(productsButton));
        driver.findElement(productsButton).click();
        return this;
    }
}
