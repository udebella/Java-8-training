package refactoringExercices.exercice1;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 08/12/16.
 */
public class OptionalsParametersTest {

    @Test
    public void testMethods() {
        assertEquals("The two method should return the same value",
                OptionalsParameters.method1(Optional.of("Test"), Optional.empty()),
                OptionalsParameters.method2(Optional.of("Test"), Optional.empty()));

        assertEquals("The two method should return the same value",
                OptionalsParameters.method1(Optional.of("Test"), Optional.of("Test2")),
                OptionalsParameters.method2(Optional.of("Test"), Optional.of("Test2")));

        assertEquals("The two method should return the same value",
                OptionalsParameters.method1(Optional.empty(), Optional.of("Test2")),
                OptionalsParameters.method2(Optional.empty(), Optional.of("Test2")));

        assertEquals("Should return length of the first parameter",
                4,
                OptionalsParameters.method1(Optional.of("Test"), Optional.empty()));

        assertEquals("First parameter is more important if all parameters are set",
                4,
                OptionalsParameters.method1(Optional.of("Test"), Optional.of("test 2")));

        assertEquals("Should return length of the second parameter",
                6,
                OptionalsParameters.method1(Optional.empty(), Optional.of("test 2")));
    }
}