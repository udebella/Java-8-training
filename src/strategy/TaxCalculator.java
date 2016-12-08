package strategy;

/**
 * Created by ubu on 03/12/16.
 */
public class TaxCalculator {

    public double getTaxes(double revenu, IPersonTypeCalculator iPersonTypeCalculator) {
        return iPersonTypeCalculator.calculateTaxes(revenu);
    }
}
