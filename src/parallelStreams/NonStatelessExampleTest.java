package parallelStreams;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 04/12/16.
 */
public class NonStatelessExampleTest {

    @Test
    public void testSums() {
        System.out.println("Sum : " + NonStatelessExample.sum(10000));
        System.out.println("Sum with side effect : " + NonStatelessExample.sumSideEffect(10000));
    }

}