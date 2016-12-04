package factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 03/12/16.
 */
public class BirdFactoryTest {
    private BirdFactory factory;

    @Before
    public void setUp() {
        factory = new BirdFactory();
    }

    @Test
    public void testCreationDuck() {
        IBird bird = factory.createBird(BirdType.Duck);
        assertEquals("It should create a duck", bird.getClass(), Duck.class);
    }

    @Test
    public void testCreationSparrow() {
        IBird bird = factory.createBird(BirdType.Sparrow);
        assertEquals("It should create a sparrow", bird.getClass(), Sparrow.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreationWoodpecker() {
        factory.createBird(BirdType.Woodpecker);
    }
}