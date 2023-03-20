package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RegistrationResults {
    SuccessfulRegistrationText("Your account was created successfully. You are now logged in."),
    UnsuccessfulRegistrationText("This username already exists.");

    private final String regTextInfo;

}
