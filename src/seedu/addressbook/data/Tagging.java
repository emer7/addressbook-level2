package seedu.addressbook.data;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Association class associating a Tag to a Person,
 * recording a Tag that is added to or deleted from a Person.
 */
public class Tagging {

    private final String state;
    private final Person person;
    private final Tag tag;

    private final String DELIMITER = " ";

    public Tagging(String state, Person person, Tag tag) {
        this.state = state;
        this.person = person;
        this.tag = tag;
    }

    /**
     * Accessor method to Person field
     * @return person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Accessor method to Tag field
     * @return tag
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * Accessor method to State field
     * @return state
     */
    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return getState()
                + DELIMITER
                + getPerson().getName().toString()
                + DELIMITER
                + getTag().toString();
    }
}
