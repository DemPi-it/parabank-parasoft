package enums;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LoginResults {
    LoginSuccessText("Accounts Overview"),
    LoginUnsuccessTitle("Error!"),
    LoginUnsuccessText("An internal error has occurred and has been logged.");


    private final String loginResult;
    public String getLoginResult(){
        return loginResult;
    }
}
