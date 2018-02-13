package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address.
 * Guarantees: immutable; is valid
 */
public class PostalCode {

    public final String value;

    public PostalCode(String postalCode) {
        this.value = postalCode;
    }
}
