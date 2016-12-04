package strategy;

/**
 * Created by ubu on 04/12/16.
 */
public class PersonTypeCalculator {

    public static double calculateForSingle(double revenu) {
        return revenu * 0.1;
    }

    public static double calculateForMarried(double revenu) {
        return revenu * 0.05;
    }
}
