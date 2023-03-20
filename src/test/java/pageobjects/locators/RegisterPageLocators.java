package pageobjects.locators;

import org.openqa.selenium.By;

public class RegisterPageLocators {
    public static final By registerButton = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    public static final By submitRegisterButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public static  final By messageWithUnsuccessfulRegister = By.xpath("//*[@id=\"customer.username.errors\"]");
    public static final By successfulRegistered = By.xpath("//*[@id=\"rightPanel\"]/p");

    public static  final String baseXpath = "//*[@id=\"loginPanel\"]/form/div[%s]/input";
}
