package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pageobjects.locators.LocationsPageLocators.LocationsButton;
import static pageobjects.locators.LocationsPageLocators.acceptCookiesButton;

public class LocationsPage extends BasePageObject{
    public LocationsPage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public LocationsPage clickLocationsButton(){
        waiter.until(ExpectedConditions.elementToBeClickable(LocationsButton));
        driver.findElement(LocationsButton).click();
        return this;
    }
    public LocationsPage acceptCookies(){
        waiter.until(ExpectedConditions.elementToBeClickable(acceptCookiesButton));
        driver.findElement(acceptCookiesButton).click();
        return this;
    }

}
