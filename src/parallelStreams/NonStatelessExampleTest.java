package parallelStreams;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 04/12/16.
 */
public class NonStatelessExampleTest {

    @Test
    public void testSums() {
        assertNotEquals(NonStatelessExample.sum(10000), NonStatelessExample.sumSideEffect(10000));
    }

}