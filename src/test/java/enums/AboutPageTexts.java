package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AboutPageTexts {
    Title("ParaSoft Demo Website"),
    Info("ParaBank is a demo site used for demonstration of Parasoft software solutions.\n" +
            "All materials herein are used solely for simulating a realistic online banking website."),
    SiteLink("www.parasoft.com"),
    MobilePhoneInText("888-305-0041");

    private final String AboutPageText;
}
