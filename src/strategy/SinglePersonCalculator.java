package strategy;

/**
 * Created by ubu on 03/12/16.
 */
public class SinglePersonCalculator implements IPersonTypeCalculator {

    @Override
    public double calculateTaxes(double revenu) {
        return revenu * 0.1;
    }
}
