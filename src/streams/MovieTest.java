package streams;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 04/12/16.
 */
public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Les bronzés", 1978);
    }

    @Test
    public void testToString() {
        assertEquals("It should display movie name", "Les bronzés", movie.toString());
    }

    @Test
    public void testGetFirstName() {
        assertEquals("It should return first name", "Les bronzés", movie.getName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("It should return last name", 1978, movie.getYear());
    }
}