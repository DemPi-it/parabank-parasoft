package validators;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;
import pageobjects.locators.RegisterPageLocators;
import specifications.BaseSeleniumTest;

import static enums.RegistrationResults.ExpectedGreeting;
import static pageobjects.locators.RegisterPageLocators.successfulRegistered;


public class RegistrationPageValidator extends BasePageObject {


    public RegistrationPageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public RegistrationPageValidator validateRegistrationResult(String expectedText, String expectedUsername){
        waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(successfulRegistered));
        String registerText = driver.findElement(successfulRegistered).getText();
        String greetingsText = driver.findElement(RegisterPageLocators.greetingsText).getText();
        Assertions.assertEquals(expectedText, registerText);
        Assertions.assertEquals(ExpectedGreeting.getRegTextInfo() + expectedUsername, greetingsText);
        return this;
    }
}
