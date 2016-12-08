package parallelStreams;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

/**
 * Created by ubu on 07/12/16.
 */
public class NonAssociativeExampleTest {

    private NonAssociativeExample nonAssociativeExample;

    @Before
    public void setUp() {
        nonAssociativeExample = new NonAssociativeExample();
        IntStream.rangeClosed(5, 7)
                .forEach(nonAssociativeExample::add);
    }

    @Test
    public void testReduceParallel() {
        System.out.println("Normal reduce : " + nonAssociativeExample.reduce());
        System.out.println("Parallel reduce : " + nonAssociativeExample.reduceParallel());
    }
}