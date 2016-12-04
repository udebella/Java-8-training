package parallelStreams;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 04/12/16.
 */
public class SumingUtilsTest {

    @Test
    public void testSums() {
        assertEquals("It should sum all the first numbers", 15, SumingUtils.sum(5));
        assertEquals("It should sum all the first numbers", 50005000, SumingUtils.sum(10000));
    }

    @Test
    public void testSumsSideEffect() {
        assertNotEquals("It should should not return the right value for the sum : the stream is not stateless !", 50005000, SumingUtils.sumSideEffect(50005000));
    }

}