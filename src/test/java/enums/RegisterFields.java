package enums;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;

@RequiredArgsConstructor
public enum RegisterFields{
    FirstName("customer.firstName"),
    LastName("customer.lastName"),
    AddressStreet("customer.address.street"),
    AdddressCity("customer.address.city"),
    AddressState("customer.address.state"),
    AddressZipCode("customer.address.zipCode"),
    PhoneNumber("customer.phoneNumber"),
    Ssn("customer.ssn"),
    Username("customer.username"),
    Password("customer.password"),
    RepeatedPassword("repeatedPassword");

    private final String id;

    public By getId(){
        return By.id(id);
    }
}