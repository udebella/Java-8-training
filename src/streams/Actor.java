package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ubu on 03/12/16.
 */
public class Actor {
    private String firstName;
    private String lastName;
    private List<Movie> playedIn = new ArrayList<>();

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addMovie(Movie movie) {
        playedIn.add(movie);
    }

    public List<Movie> getPlayedIn() {
        return playedIn;
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
