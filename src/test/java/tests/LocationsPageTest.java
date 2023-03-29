package tests;

import org.junit.jupiter.api.Test;
import specifications.BaseSeleniumTest;

import static enums.LocationsPageResults.*;

public class LocationsPageTest extends BaseSeleniumTest {

    @Test
    public void locationsPageTest(){
        locationsPage
                .clickLocationsButton()
                .acceptCookies();
        locationsPageValidator
                .validateRedirection(ExpectedLocationsUrl.getLocationsPageResult())
                .validatePageTitle(ExpectedPageTitle.getLocationsPageResult())
                .validateTextTitle(ExpectedTextTitle.getLocationsPageResult());
    }
}
