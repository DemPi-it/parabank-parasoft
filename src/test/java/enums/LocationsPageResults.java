package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum LocationsPageResults {
    ExpectedPageTitle("Automated Software Testing Solutions For Every Testing Need"),
    ExpectedTextTitle("The Parasoft Continuous Quality Platform: Solutions to Help You Deliver With Confidence"),
    ExpectedLocationsUrl("https://www.parasoft.com/solutions/");
    private final String locationsPageResult;
}
