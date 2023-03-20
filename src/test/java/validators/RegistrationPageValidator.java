package validators;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;
import specifications.BaseSeleniumTest;

import static pageobjects.locators.RegisterPageLocators.successfulRegistered;


public class RegistrationPageValidator extends BasePageObject {


    public RegistrationPageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public void validateRegistrationResult(String expectedText){
        String registerText = driver.findElement(successfulRegistered).getText();
        Assertions.assertEquals(expectedText, registerText);
    }
}
