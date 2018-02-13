package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in the address.
 * Guarantees: immutable; is valid
 */
public class Unit {

    public final String value;

    public Unit(String unit) {
        this.value = unit;
    }
}
