package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import specifications.BaseSeleniumTest;

import java.time.Duration;

public class ProductsPage extends BaseSeleniumTest {

    private final By productsButton = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a");
    private final By titleOnRedirectedPageXpath = By.xpath("/html/body/section[1]/div/div/div/div/div/div/h1");
    private final By acceptCookiesXpath = By.xpath("//*[@id=\"hs-eu-confirmation-button\"]");
    private String expectedTitile = "Innovative and Intelligent Software Testing Platform";
    private String expectedUrl = "https://www.parasoft.com/products/";

    @Test
    public void redirectionTest(){
        driver.get("https://parabank.parasoft.com/parabank/about.htm");
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        waiter.until(ExpectedConditions.elementToBeClickable(productsButton));
        driver.findElement(productsButton).click();
        waiter.until(ExpectedConditions.elementToBeClickable(acceptCookiesXpath));
        driver.findElement(acceptCookiesXpath).click();
        String titleOnRedirectedPageText = driver.findElement(titleOnRedirectedPageXpath).getText();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, currentUrl);
        Assertions.assertEquals(expectedTitile, titleOnRedirectedPageText);
    }
}
