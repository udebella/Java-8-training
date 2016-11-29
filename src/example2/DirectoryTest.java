package example2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 15/11/16.
 */
public abstract class DirectoryTest {
    private List<People> directory;
    private IDirectoryFilter directoryFilter;

    protected abstract IDirectoryFilter instanciateDirectoryFilter();

    @Before
    public void setUpTests() {
        directory = new ArrayList<>();
        directory.add(new People("Quentin", "Letel"));
        directory.add(new People("Guillaume", "Labat"));
        directory.add(new People("Ubald", "de Bellabre"));
        directoryFilter = instanciateDirectoryFilter();
    }

    @Test
    public void when_letter_is_input_then_output_should_be_list_of_first_name_of_people_name() {
        assertEquals(Collections.singletonList("Ubald"), directoryFilter.filter(directory, 'd'));
    }

    @Test
    public void when_more_than_one_result_then_should_be_ordered_by_firstname() {
        assertEquals(Arrays.asList("Guillaume", "Quentin"), directoryFilter.filter(directory, 'L'));
    }
}
