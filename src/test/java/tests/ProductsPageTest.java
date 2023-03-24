package tests;

import org.junit.jupiter.api.Test;
import specifications.BaseSeleniumTest;

import static enums.ProductsPageExpectedResults.*;

public class ProductsPageTest extends BaseSeleniumTest {
    @Test
    public void productsPageTest(){
        productsPage
                .clickOnProductsLink()
                .clickOnAcceptCookiesButton();
        productsPageValidator
                .validateRedirection(expectedUrl.getExpectedResult())
                .validatePageTitle(expectedPageTitle.getExpectedResult())
                .validateTextTitle(expectedTextTitle.getExpectedResult());
    }
}
