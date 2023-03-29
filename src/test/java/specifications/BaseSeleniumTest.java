package specifications;

import io.github.bonigarcia.wdm.WebDriverManager;
import models.RegistrationUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;
import validators.*;

import java.time.Duration;

public class BaseSeleniumTest {
    protected final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    protected WebDriver driver;
    protected WebDriverWait waiter;
    protected  RegisterPage registerPage;
    protected RegistrationPageValidator registrationValidator;
    protected LoginPage loginPage;
    protected LoginValidator loginValidator;
    protected AboutPage aboutPage;
    protected AboutPageValidator aboutPageValidator;
    protected ProductsPage productsPage;
    protected ProductsPageValidator productsPageValidator;
    protected LocationsPage locationsPage;
    protected LocationsPageValidator locationsPageValidator;

    protected final RegistrationUser user = RegistrationUser.builder()
            .firstName("Kirill")
            .lastName("Bolotin")
            .street("Stephan Shutov St.")
            .city("Moscow")
            .state("Russia")
            .zipCode("nvm")
            .phoneNumber("79774225744")
            .ssn("nvm")
            .username("demo")
            .password("demo123")
            .build();

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        waiter =  new WebDriverWait(driver, Duration.ofSeconds(10));
        registrationValidator = new RegistrationPageValidator(driver, waiter);
        loginValidator = new LoginValidator(driver, waiter);
        aboutPageValidator = new AboutPageValidator(driver, waiter);
        registerPage= new RegisterPage(driver, waiter);
        loginPage = new LoginPage(driver, waiter);
        aboutPage = new AboutPage(driver, waiter);
        productsPage = new ProductsPage(driver, waiter);
        productsPageValidator = new ProductsPageValidator(driver, waiter);
        locationsPage = new LocationsPage(driver, waiter);
        locationsPageValidator = new LocationsPageValidator(driver, waiter);
        BasePageObject basePageObject = new BasePageObject(driver, waiter);
        driver.get(URL);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

}
