package factory;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by ubu on 03/12/16.
 */
public class BirdFactory {
    private HashMap<BirdType, Supplier<IBird>> constructorsList = new HashMap<>();

    public BirdFactory() {
        constructorsList.put(BirdType.Duck, Duck::new);
        constructorsList.put(BirdType.Sparrow, Sparrow::new);
    }

    public IBird createBird(BirdType type) {
        Optional<Supplier<IBird>> constructor = Optional.ofNullable(constructorsList.get(type));
        return constructor
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("Bird type " + type + " is not supported"));
    }
}
