package optionals;

/**
 * Created by ubu on 04/12/16.
 */
public class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public String getInsuranceName() {
        if (car != null) {
            if (car.getInsurance() != null) {
                return car.getInsurance().getName();
            }
        }
        return null;
    }
}
