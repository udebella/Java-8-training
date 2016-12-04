package sortingLists;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by ubu on 03/12/16.
 */
public class DirectoryTest {
    private Directory directory;

    @Before
    public void setUp() {
        directory = new Directory();
        directory.add(new People("Josiane", "Balasko"));
        directory.add(new People("Christian", "Clavier"));
        directory.add(new People("Gérard", "Jugnot"));
        directory.add(new People("Michel", "Blanc"));
    }

    @Test
    public void testAddingPeople() {
        int directoryLength = directory.peopleList.size();
        directory.add(new People("Jean", "Dujardin"));
        assertEquals("It should add people to the directory", directory.peopleList.size(), directoryLength + 1);
    }

    @Test
    public void testToString() {
        assertEquals("It should sort people by last name",
                "Josiane Balasko, Christian Clavier, Gérard Jugnot, Michel Blanc",
                directory.toString());
    }

    @Test
    public void testSorting() {
        Comparator<People> comparatorLastName = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
        assertEquals("It should sort people by last name",
                "Josiane Balasko, Michel Blanc, Christian Clavier, Gérard Jugnot",
                directory.sort(comparatorLastName).toString());

        Comparator<People> comparatorFirstName = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
        assertEquals("It should sort people by first name",
                "Christian Clavier, Gérard Jugnot, Josiane Balasko, Michel Blanc",
                directory.sort(comparatorFirstName).toString());
    }
}