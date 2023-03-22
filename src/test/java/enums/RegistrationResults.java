package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RegistrationResults {
    SuccessfulRegistrationText("Your account was created successfully. You are now logged in."),
    ExpectedGreeting("Welcome "),
    UnsuccessfulRegistrationText("This username already exists.");

    private final String regTextInfo;

}
