package example2.java8impl.java7impl;

import example2.DirectoryTest;
import example2.IDirectoryFilter;

/**
 * Created by ubu on 15/11/16.
 */
public class DirectoryJava8Test extends DirectoryTest {
    @Override
    protected IDirectoryFilter instanciateDirectoryFilter() {
        return new DirectoryFilter();
    }
}
