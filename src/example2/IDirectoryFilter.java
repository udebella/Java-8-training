package example2;

import java.util.List;

/**
 * Created by ubu on 15/11/16.
 */
public interface IDirectoryFilter {
    List<String> filter(List<People> directory, char firstLastNameLetter);
}
