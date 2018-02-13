package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address.
 * Guarantees: immutable; is valid
 */
public class Block {

    public final String value;

    public Block(String block) {
        this.value = block;
    }
}
