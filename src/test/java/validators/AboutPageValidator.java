package validators;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import static enums.AboutPageTexts.*;
import static pageobjects.locators.AboutPageLocators.*;
import static pageobjects.locators.AboutPageLocators.MobilePhone;

public class AboutPageValidator extends BasePageObject {
    public AboutPageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public void aboutPageValidate(){
        waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AboutPageTextTitle));
        String actualTitle = driver.findElement(AboutPageTextTitle).getText();
        String actualInfo = driver.findElement(AboutPageInfo).getText();
        String actualSite = driver.findElement(Site).getText();
        String actualMobilePhone = driver.findElement(MobilePhone).getText();
        Assertions.assertEquals(Title.getAboutPageText(), actualTitle);
        Assertions.assertEquals(Info.getAboutPageText(), actualInfo);
        Assertions.assertEquals(SiteLink.getAboutPageText(), actualSite);
        Assertions.assertTrue(actualMobilePhone.contains(MobilePhoneInText.getAboutPageText()));
    }
}
