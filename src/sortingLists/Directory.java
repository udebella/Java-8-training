package sortingLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ubu on 03/12/16.
 */
public class Directory {
    List<People> peopleList = new ArrayList<>();

    public void add(People people) {
        peopleList.add(people);
    }

    public Directory sort(Comparator<People> comparator) {
        peopleList.sort(comparator);
        return this;
    }

    public String toString() {
        return peopleList.stream()
                .map(People::toString)
                .collect(Collectors.joining(", "));
    }
}
