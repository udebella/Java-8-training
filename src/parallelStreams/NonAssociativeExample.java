package parallelStreams;

import java.util.ArrayList;
import java.util.List;

/**
 * Reducing operations should be associative
 * Created by ubu on 07/12/16.
 */
public class NonAssociativeExample {
    private List<Integer> integers = new ArrayList<>();

    public void add(int s) {
        this.integers.add(s);
    }

    public Double reduce() {
        return integers.stream()
                .reduce(0d, (integer, integer2) -> (integer + integer2) / 2, (integer, integer2) -> integer + integer2);
    }

    public Double reduceParallel() {
        return integers.stream()
                .parallel()
                .reduce(0d, (integer, integer2) -> (integer + integer2) / 2, (integer, integer2) -> integer + integer2);
    }
}
