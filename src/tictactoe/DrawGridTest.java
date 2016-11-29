package tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ubu on 29/11/16.
 */
public class DrawGridTest {
    Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(new Character[][]{
                new Character[] {'A', 'B', 'A'},
                new Character[] {'B', 'B', 'A'},
                new Character[] {'A', 'A', 'B'}
        });
    }

    @Test
    public void isWon() {
        assertTrue(grid.isWonBy() == null);
    }
}
