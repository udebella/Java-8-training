package example1.java8impl;

import example1.IMinimumFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ubu on 12/11/16.
 */
public class MinimumFilter implements IMinimumFilter {

    @Override
    public List<Integer> filter(List<Integer> list, int minimum) {
        return list.stream()
                .filter(number -> number > minimum)
                .collect(Collectors.toList());
    }
}
