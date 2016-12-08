package refactoringExercices.exerice2;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Created by ubu on 08/12/16.
 */
public class Something {
    public LigneDeStat doSomething(int reportYear, int reportYearReference, int statistiqueValue) {

        Function<Integer, BiConsumer<LigneDeStat, Number>> getValueSetterGroupe = year -> (stat, value) -> {
            if (year == reportYear) {
                stat.setGroupAvg(value);
            } else {
                stat.setPreviousGroupAvg(value);
            }
        };


        BiConsumer<LigneDeStat, Number> setValueGroupe = getValueSetterGroupe.apply(reportYearReference);


        LigneDeStat nombreDeFactures = new LigneDeStat();
        setValueGroupe.accept(nombreDeFactures, statistiqueValue);

        return nombreDeFactures;
    }
}
