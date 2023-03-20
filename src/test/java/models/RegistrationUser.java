package models;

import enums.RegisterFields;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistrationUser {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String ssn;
    private String username;
    private String password;
}
