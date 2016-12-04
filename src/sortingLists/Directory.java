package sortingLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        StringBuilder directoryAsString = new StringBuilder();
        int counter = 0;
        for (People people : peopleList) {
            directoryAsString.append(people.toString());
            if (++counter < peopleList.size()) {
                directoryAsString.append(", ");
            }
        }
        return directoryAsString.toString();
    }
}
