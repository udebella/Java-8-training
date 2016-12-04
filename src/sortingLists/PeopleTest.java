package sortingLists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 03/12/16.
 */
public class PeopleTest {

    private People people;

    @Before
    public void setUp() {
        people = new People("Christian", "Clavier");
    }

    @Test
    public void testToString() {
        assertEquals("It should display people name", "Christian Clavier", people.toString());
    }

    @Test
    public void testGetFirstName() {
        assertEquals("It should return first name", "Christian", people.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("It should return last name", "Clavier", people.getLastName());
    }
}