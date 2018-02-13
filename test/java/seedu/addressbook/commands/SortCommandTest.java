package seedu.addressbook.commands;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.UniquePersonList;
import seedu.addressbook.util.TestUtil;

public class SortCommandTest {

    @Test
    public void sortCommand_addressBookWithMockElements_addressBookInSortedOrder() {
        SortCommand command = new SortCommand();

        Person naruto = TestUtil.generateTestPerson("Naruto");
        Person sasuke = TestUtil.generateTestPerson("Sasuke");
        Person zetsu = TestUtil.generateTestPerson("Zetsu");
        Person sakura = TestUtil.generateTestPerson("Sakura");
        Person kakashi = TestUtil.generateTestPerson("Kakashi");
        
        AddressBook book = TestUtil.createAddressBook(naruto, sasuke, zetsu, sakura, kakashi);
        List<Person> SORTED_LIST = Arrays.asList(kakashi, naruto, sakura, sasuke, zetsu);

        command.setData(book, Collections.emptyList());
        command.execute();

        UniquePersonList people = book.getAllPersons();
        UniquePersonList expected = null;
        try {
            expected = new UniquePersonList(SORTED_LIST);
        } catch (Exception e) {
            System.out.println("exception");
        }

        assertTrue(people.equals(expected));
    }
}
