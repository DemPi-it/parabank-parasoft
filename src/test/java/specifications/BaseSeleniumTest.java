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
import pageobjects.BasePageObject;
import pageobjects.RegisterPage;
import validators.RegistrationPageValidator;

import java.time.Duration;

public class BaseSeleniumTest {
    protected final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    protected WebDriver driver;
    protected WebDriverWait waiter;
    protected  RegisterPage registerPage;
    protected RegistrationPageValidator validator;
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
        validator = new RegistrationPageValidator(driver, waiter);
        registerPage= new RegisterPage(driver, waiter);
        BasePageObject basePageObject = new BasePageObject(driver, waiter);
        driver.get(URL);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void checkUrl(){
        driver.get(URL);
    }

}
