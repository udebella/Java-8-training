package example1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 12/11/16.
 */
public abstract class MinimumFilterTest {
    private IMinimumFilter minimumFilter;
    private List<Integer> list;

    public abstract IMinimumFilter instanciateMinimumFilter();

    @Before
    public void setUpTests() {
        list = Arrays.asList(1, 2, 3, 4);
        minimumFilter = instanciateMinimumFilter();
    }

    @Test
    public void when_min_value_is_less_than_minimum_then_same_list_is_output() {
        assertEquals(Arrays.asList(1, 2, 3, 4), minimumFilter.filter(list, 0));
    }

    @Test
    public void when_min_value_is_greater_than_minimum_then_list_is_filtered() {
        assertEquals(Arrays.asList(3, 4), minimumFilter.filter(list, 2));
    }

    @Test
    public void when_min_value_is_greater_than_maximum_then_an_empty_list_is_returned() {
        assertEquals(new ArrayList<Integer>(), minimumFilter.filter(list, 9));
    }
}