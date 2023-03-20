package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

import static enums.RegistrationResults.SuccessfulRegistrationText;

public class RegisterPageTest extends BaseSeleniumTest {
    @Test
    public void registerTest(){
        registerPage
                .clickRegisterButton()
                .fillForm(user)
                .submitRegisterButton();
        validator.validateRegistrationResult(SuccessfulRegistrationText.getRegTextInfo());

    }

//    @Test
//    public void unsuccessfulRegisterTest(){
//        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
//        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
//        waiter.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"))));
//        registerForm();
//        String errorText = driver.findElement(messageWithUnsuccessfulRegister).getText();
//        Assertions.assertEquals("This username already exists.", errorText);
//    }
}
