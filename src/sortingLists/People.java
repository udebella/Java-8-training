package sortingLists;

/**
 * Created by ubu on 03/12/16.
 */
public class People {
    private String firstName;
    private String lastName;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        StringBuilder name = new StringBuilder(firstName);
        name.append(" ").append(lastName);
        return name.toString();
    }
}
