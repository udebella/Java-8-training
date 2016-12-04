package optionals;

import java.util.Optional;

/**
 * Created by ubu on 04/12/16.
 */
public class Car {
    private Optional<Insurance> insurance;

    public Car(Insurance insurance) {
        this.insurance = Optional.of(insurance);
    }
    public Car() {
        this.insurance = Optional.empty();
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
