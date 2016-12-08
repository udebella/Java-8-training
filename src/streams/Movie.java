package streams;

/**
 * Created by ubu on 04/12/16.
 */
public class Movie {
    private String name;
    private int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
            return this.equals((Movie) obj);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + year;
        return result;
    }

    public boolean equals(Movie movie) {
        return movie.getName().equals(name) && movie.getYear() == year;
    }

    @Override
    public String toString() {
        return name;
    }
}
