package strategy;

/**
 * Created by ubu on 03/12/16.
 */
@FunctionalInterface
public interface IPersonTypeCalculator {
    double calculateTaxes(double revenu);
}
