package pageobjects.locators;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;

@RequiredArgsConstructor
public enum LoginPageLocators {
    LoginSuccessXpathText (By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")),
//    LoginSuccessXpathText ("//*[contains(@class 'title')]"),
    AccountID (By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")),
    CurrentBalance (By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[2]")),
    ErrorText (By.xpath("//*[@id=\"rightPanel\"]/p")),
    ErrorPageTitle (By.xpath("//*[@id=\"rightPanel\"]/h1"));

    public By getPath() {
        return path;
    }

    private final By path;

}