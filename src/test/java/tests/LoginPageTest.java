package tests;

import enums.LoginResults;
import org.junit.jupiter.api.Test;
import pageobjects.locators.LoginPageLocators;
import specifications.BaseSeleniumTest;

import static enums.LoginResults.LoginUnsuccessText;
import static enums.LoginResults.LoginUnsuccessTitle;

//import static enums.LoginResults.LoginSuccessText;
//import static pageobjects.locators.LoginPageLocators.LoginSuccessXpathText;

public class LoginPageTest extends BaseSeleniumTest {


    @Test
    public void loginTest(){
        loginPage
                .login(user.getUsername(), user.getPassword())
                .clickLoginButton();
        loginValidator
                .validateLogin(LoginResults.LoginSuccessText.getLoginResult());

    }

    @Test
    public void unsuccessLoginTest(){
        loginPage
                .login("123", "123")
                .clickLoginButton();
        loginValidator
                .validateUnsuccessLogin(LoginUnsuccessTitle.getLoginResult(), LoginUnsuccessText.getLoginResult());
    }
}
