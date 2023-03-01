package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

public class RegisterPage extends BaseSeleniumTest {
    private final By registerButton = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    private final By submitRegisterButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    private final By successfulRegistered = By.xpath("//*[@id=\"rightPanel\"]/p");
    private final By messageWithUnsuccessfulRegister = By.xpath("//*[@id=\"customer.username.errors\"]");
    private String username = "demo";
    private String password = "demo123";
    @Test
    public void registerTest(){
        driver.get(URL);
        driver.findElement(registerButton).click();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        waiter.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"))));
        registerForm();
        String registerText = driver.findElement(successfulRegistered).getText();
        Assertions.assertEquals("Your account was created successfully. You are now logged in.", registerText);
    }

    @Test
    public void unsuccessfulRegisterTest(){
        driver.get(URL);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        waiter.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"))));
        registerForm();
        String errorText = driver.findElement(messageWithUnsuccessfulRegister).getText();
        Assertions.assertEquals("This username already exists.", errorText);
    }

    private void registerForm(){
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Kirill");
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Bolotin");
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("nvm");
        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Moscow");
        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Russia");
        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("nvm");
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("797756546");
        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("123123");
        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys(password);
        driver.findElement(submitRegisterButton).click();
    }
}
