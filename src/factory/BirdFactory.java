package factory;

/**
 * Created by ubu on 03/12/16.
 */
public class BirdFactory {

    public IBird createBird(BirdType type) {
        switch (type) {
            case Duck:
                return new Duck();
            case Sparrow:
                return new Sparrow();
        }
        return null;
    }
}
