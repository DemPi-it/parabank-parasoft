package validators;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import static enums.LoginResults.LoginSuccessText;
import static pageobjects.locators.LoginPageLocators.*;

public class LoginValidator extends BasePageObject {
    public LoginValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public void validateLogin(String expectedText){
        waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(LoginSuccessXpathText.getPath()));
        String textAfterLogin = driver.findElement(LoginSuccessXpathText.getPath()).getText();
        Assertions.assertEquals(expectedText, textAfterLogin);
    }

    public void validateUnsuccessLogin(String expectedTitle, String expectedText){
        waiter.until(ExpectedConditions.presenceOfElementLocated(ErrorPageTitle.getPath()));
        String textAfterFailedLogin = driver.findElement(ErrorText.getPath()).getText();
        String titleAfterFailedLogin = driver.findElement(ErrorPageTitle.getPath()).getText();
        Assertions.assertEquals(expectedTitle, titleAfterFailedLogin);
        Assertions.assertEquals(expectedText, textAfterFailedLogin);
    }
}
