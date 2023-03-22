package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum XpathForLogin {
    LoginXpath("//*[@id=\"loginPanel\"]/form/div[1]/input"),
    PasswordXpath("//*[@id=\"loginPanel\"]/form/div[2]/input"),
    ButtonXpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    private final String xpath;

    public String getXpath(){
        return xpath;
    }
}
