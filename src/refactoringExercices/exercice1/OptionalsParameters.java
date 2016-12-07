package refactoringExercices.exercice1;

import java.util.Optional;

/**
 * Created by ubu on 08/12/16.
 */
public class OptionalsParameters {
    public static int method1(Optional<String> opt1, Optional<String> opt2){
        return opt1.map(str -> str.length())
                .orElseGet(() -> opt2.map(str -> str.length())
                        .orElse(0));
    }
    public static int method2(Optional<String> opt1, Optional<String> opt2){
        if(opt1.isPresent()){
            return opt1.get().length();
        }
        if(opt2.isPresent()){
            return opt2.get().length();
        }
        return 0;
    }
}
