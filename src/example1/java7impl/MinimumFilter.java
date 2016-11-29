package example1.java7impl;

import example1.IMinimumFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ubu on 12/11/16.
 */
public class MinimumFilter implements IMinimumFilter {

    public List<Integer> filter(List<Integer> list, int minimum) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : list) {
            if (number > minimum) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }
}
