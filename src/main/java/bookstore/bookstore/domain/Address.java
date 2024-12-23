package bookstore.bookstore.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String street;
    private String etc;
    private String zipcode;

    protected Address() {
    }

    public Address(String street, String etc, String zipcode) {
        this.street = street;
        this.etc = etc;
        this.zipcode = zipcode;
    }
}
