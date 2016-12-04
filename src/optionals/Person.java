package optionals;

import java.util.Optional;

/**
 * Created by ubu on 04/12/16.
 */
public class Person {
    private Optional<Car> car;

    public Person() {
        car = Optional.empty();
    }

    public Person(Car car) {
        this.car = Optional.of(car);
    }

    public String getInsuranceName() {
        return car.flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
