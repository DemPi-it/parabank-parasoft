package pageobjects;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

@RequiredArgsConstructor
public class BasePageObject{
    protected final WebDriver driver;
    protected final WebDriverWait waiter;
}
