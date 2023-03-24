package validators;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import static pageobjects.locators.ProductsPageLocators.TextTitleOnRedirectedPageXpath;

public class ProductsPageValidator extends BasePageObject {
    public ProductsPageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public ProductsPageValidator validateRedirection(String expectedUrl){
        waiter.until(ExpectedConditions.presenceOfElementLocated(TextTitleOnRedirectedPageXpath));
        Assertions.assertEquals(expectedUrl, driver.getCurrentUrl());
        return this;
    }

    public ProductsPageValidator validateTextTitle(String expectedTextTitle){
        waiter.until(ExpectedConditions.presenceOfElementLocated(TextTitleOnRedirectedPageXpath));
        String currentTextTitle = driver.findElement(TextTitleOnRedirectedPageXpath).getText();
        Assertions.assertEquals(expectedTextTitle, currentTextTitle);
        return this;
    }

    public ProductsPageValidator validatePageTitle(String expectedPageTitle){
        waiter.until(ExpectedConditions.presenceOfElementLocated(TextTitleOnRedirectedPageXpath));
        String currentTitle = driver.getTitle();
        Assertions.assertEquals(expectedPageTitle, currentTitle);
        return this;
    }
}
