package tests;

import org.junit.jupiter.api.Test;
import specifications.BaseSeleniumTest;

public class AboutPageTest extends BaseSeleniumTest {

    @Test
    public void aboutPageTest(){
        aboutPage.clickAboutButton();
        aboutPageValidator.aboutPageValidate();
    }
}
