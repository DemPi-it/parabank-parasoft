package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ProductsPageExpectedResults {
    expectedTextTitle("Innovative and Intelligent Software Testing Platform"),
    expectedPageTitle("Automated Software Testing Tool Suite | Parasoft"),
    expectedUrl("https://www.parasoft.com/products/");

    private final String expectedResult;
}
