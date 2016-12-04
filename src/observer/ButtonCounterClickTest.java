package observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 03/12/16.
 */
public class ButtonCounterClickTest {
    private Button button;
    private ButtonCounterClick buttonCounterClick;

    @Before
    public void setUp() {
        button = new Button();
        buttonCounterClick = new ButtonCounterClick();
        button.addListener(buttonCounterClick::handleClick);
    }

    @Test
    public void testClick() {
        button.click();
        assertEquals("It should increment counter click", buttonCounterClick.getCounter(), 1);
        button.click();
        assertEquals("It should increment counter click", buttonCounterClick.getCounter(), 2);
    }
}