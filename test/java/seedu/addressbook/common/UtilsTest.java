package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }
    
    @Test
    public void isAnyNullTest() {
        // empty list
        assertThereIsNoNull();

        // only one null object
        assertThereIsNull((Object) null);

        // there are no null objects
        assertThereIsNoNull("abc", "ab", "a");
        assertThereIsNoNull(1, 2);
        assertThereIsNoNull("abc", "abc");
        assertThereIsNoNull("abc", "", "abc", "ABC");
        assertThereIsNoNull("", "abc", "a", "abc");
        assertThereIsNoNull(1, new Integer(1));
        assertThereIsNoNull("a", "b");
        

        // there are null objects
        assertThereIsNull("abc", "ab", "a", null);
        assertThereIsNull(1, 2, null);
        assertThereIsNull(null, "abc", "abc");
        assertThereIsNull("abc", "", null, "abc", "ABC");
        assertThereIsNull("", "abc", "a", "abc", null);
        assertThereIsNull(1, new Integer(1), null);
        assertThereIsNull("a", "b", null);
        assertThereIsNull(null, null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
    
    private void assertThereIsNull(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }

    private void assertThereIsNoNull(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }
}
