package validators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;
import specifications.BaseSeleniumTest;

import static pageobjects.locators.LocationsPageLocators.currentTextTitleXpath;

public class LocationsPageValidator extends BasePageObject {
    public LocationsPageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public LocationsPageValidator validateRedirection(String expectedUrl){
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, currentUrl);
        return this;
    }

    public LocationsPageValidator validatePageTitle(String expectedPageTitle){
        String currentPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedPageTitle, currentPageTitle);
        return this;
    }

    public LocationsPageValidator validateTextTitle(String expectedTextTitle){
        String currentTextTitle = driver.findElement(currentTextTitleXpath).getText();
        Assertions.assertEquals(expectedTextTitle, currentTextTitle);
        return this;
    }

}
