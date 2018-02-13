package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address.
 * Guarantees: immutable; is valid
 */
public class Street {

    public final String value;

    public Street(String street) {
        this.value = street;
    }

}
