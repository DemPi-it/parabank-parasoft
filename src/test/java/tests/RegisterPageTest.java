package tests;

import org.junit.jupiter.api.Test;
import specifications.BaseSeleniumTest;

import static enums.RegistrationResults.SuccessfulRegistrationText;

public class RegisterPageTest extends BaseSeleniumTest {
    @Test
    public void registerTest(){
        registerPage
                .clickRegisterButton()
                .fillRegistrationForm(user)
                .submitRegisterButton();
        registrationValidator.validateRegistrationResult(SuccessfulRegistrationText.getRegTextInfo(), user.getUsername());

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
