package optionals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by ubu on 04/12/16.
 */
public class PersonTest {

    @Test
    public void testGetInsuranceName() {
        Person person = new Person(new Car(new Insurance("Axa")));
        assertEquals("It should return insurance name of the car of the person", "Axa", person.getInsuranceName());

        person = new Person(null);
        assertNull("It should return null if the person does not have a car", person.getInsuranceName());

        person = new Person(new Car(null));
        assertNull("It should return null the person's car is not insured", person.getInsuranceName());
    }

}