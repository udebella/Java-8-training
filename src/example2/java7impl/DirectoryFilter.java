package example2.java7impl;

import example2.IDirectoryFilter;
import example2.People;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ubu on 15/11/16.
 */
public class DirectoryFilter implements IDirectoryFilter {

    @Override
    public List<String> filter(List<People> directory, char firstLastNameLetter) {
        List<String> matchingPeopleFirstname = new ArrayList<>();
        for(People people : directory) {
            if (people.getLastname().charAt(0) == firstLastNameLetter) {
                matchingPeopleFirstname.add(people.getFirstname());
            }
        }
        matchingPeopleFirstname.sort(new Comparator<String>() {
            @Override
            public int compare(String firstName1, String firstName2) {
                return firstName1.compareTo(firstName2);
            }
        });
        return matchingPeopleFirstname;
    }
}
