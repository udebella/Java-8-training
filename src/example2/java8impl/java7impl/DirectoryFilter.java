package example2.java8impl.java7impl;

import example2.IDirectoryFilter;
import example2.People;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ubu on 15/11/16.
 */
public class DirectoryFilter implements IDirectoryFilter {

    @Override
    public List<String> filter(List<People> directory, char firstLastNameLetter) {
        return directory.stream()
                .filter((people) -> people.getLastname().charAt(0) == firstLastNameLetter)
                .map(People::getFirstname)
                .sorted()
                .collect(Collectors.toList());
    }
}
