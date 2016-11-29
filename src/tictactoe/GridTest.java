package tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 29/11/16.
 */
public class GridTest {
    Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(new Character[][]{
                new Character[] {'A', 'A', 'A'},
                new Character[] {'B', 'B', '0'},
                new Character[] {'A', '0', 'B'}
        });
    }

    @Test
    public void initialisation() {
        assertEquals(grid.getBoxes().length, 9);
    }

    @Test
    public void firstLine() {
        assertArrayEquals(grid.getLine(1), new Character[] {'A', 'A', 'A'});
    }

    @Test
    public void secondLine() {
        assertArrayEquals(grid.getLine(2), new Character[] {'B', 'B', '0'});
    }

    @Test
    public void thirdLine() {
        assertArrayEquals(grid.getLine(3), new Character[] {'A', '0', 'B'});
    }

    @Test
    public void firstColumn() {
        assertArrayEquals(grid.getColumn(1), new Character[] {'A', 'B', 'A'});
    }

    @Test
    public void secondColumn() {
        assertArrayEquals(grid.getColumn(2), new Character[] {'A', 'B', '0'});
    }

    @Test
    public void thirdColumn() {
        assertArrayEquals(grid.getColumn(3), new Character[] {'A', '0', 'B'});
    }

    @Test
    public void diagonal() {
        assertArrayEquals(grid.getDiagonal(), new Character[] {'A', 'B', 'B'});
    }

    @Test
    public void antiDiagonal() {
        assertArrayEquals(grid.getAntiDiagonal(), new Character[] {'A', 'B', 'A'});
    }

    @Test
    public void isWon() {
        assertEquals((Character)'A', grid.isWonBy());
    }
}