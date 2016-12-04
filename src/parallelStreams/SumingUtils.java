package parallelStreams;

import java.util.stream.IntStream;

/**
 * Created by ubu on 04/12/16.
 */
public class SumingUtils {

    /**
     * Correct way to implement sum to get it to work as parallel stream
     */
    public static int sum(int number) {
        return IntStream.rangeClosed(0, number)
                .parallel()
                .sum();
    }

    /**
     * This implementation mutate an other object during sum process.
     */
    public static int sumSideEffect(int number) {
        Accumulator acc = new Accumulator();
        IntStream.rangeClosed(0, number)
                .parallel()
                .forEach(acc::add);
        return acc.getSum();
    }

    private static class Accumulator {
        private int sum = 0;
        public void add(int value) {
            sum += value;
        }

        public int getSum() {
            return sum;
        }
    }
}
