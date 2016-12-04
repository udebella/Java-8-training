package strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ubu on 03/12/16.
 */
public class TaxCalculatorTest {
    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        taxCalculator = new TaxCalculator();
    }

    @Test
    public void calculateTaxForSinglePerson() {
        assertEquals("Taxes should be 10% for a single person", 1000, taxCalculator.getTaxes(10000, PersonTypeCalculator::calculateForSingle), 0);
    }

    @Test
    public void calculateTaxForMarriedPerson() {
        assertEquals("Taxes should be 5% for a person which is married", 500, taxCalculator.getTaxes(10000, PersonTypeCalculator::calculateForMarried), 0);
    }

}