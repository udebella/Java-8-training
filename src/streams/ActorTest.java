package streams;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 03/12/16.
 */
public class ActorTest {

    private Actor actor;

    @Before
    public void setUp() {
        actor = new Actor("Christian", "Clavier");
    }

    @Test
    public void testToString() {
        assertEquals("It should display actor name", "Christian Clavier", actor.toString());
    }

    @Test
    public void testGetFirstName() {
        assertEquals("It should return first name", "Christian", actor.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("It should return last name", "Clavier", actor.getLastName());
    }
}