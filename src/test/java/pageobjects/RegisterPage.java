package pageobjects;

import enums.RegisterFields;
import lombok.RequiredArgsConstructor;
import models.RegistrationUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import javax.swing.plaf.nimbus.State;

import static enums.RegisterFields.*;
import static pageobjects.locators.RegisterPageLocators.*;


public class RegisterPage extends BasePageObject{

    public RegisterPage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public void login(String username, String password){
        driver.findElement(By.xpath(String.format(baseXpath, 1))).sendKeys(username);//enums
        driver.findElement(By.xpath(String.format(baseXpath, 2))).sendKeys(password);
        driver.findElement(By.xpath(String.format(baseXpath, 3))).click();
    }

    public RegisterPage fillForm(RegistrationUser regUser){
        waiter.until(ExpectedConditions.elementToBeClickable(submitRegisterButton));
        fillFormField(FirstName, regUser.getFirstName());
        fillFormField(LastName, regUser.getLastName());
        fillFormField(AddressStreet, regUser.getStreet());
        fillFormField(AdddressCity, regUser.getCity());
        fillFormField(AddressState, regUser.getState());
        fillFormField(AddressZipCode, regUser.getZipCode());
        fillFormField(PhoneNumber, regUser.getPhoneNumber());
        fillFormField(Ssn, regUser.getSsn());
        fillFormField(Username, regUser.getUsername());
        fillFormField(Password, regUser.getPassword());
        fillFormField(RepeatedPassword, regUser.getPassword());
        return this;
    }

    public RegisterPage submitRegisterButton(){
        driver.findElement(submitRegisterButton).click();
        return this;
    }

    public RegisterPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return this;
    }

    public void fillFormField(RegisterFields registerFields, String value){
        driver.findElement(registerFields.getId()).sendKeys(value);
    }
}
