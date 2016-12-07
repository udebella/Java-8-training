package streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ubu on 03/12/16.
 */
public class Directory {
    List<Actor> actorList = new ArrayList<>();

    public void add(Actor actor) {
        actorList.add(actor);
    }

    public String toString() {
        return printList(this.actorList);
    }

    private String printList(Collection<?> listToPrint) {
        return listToPrint.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public String printOrderedByName() {
        return actorList.stream()
                .sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()))
                .map(Actor::toString)
                .collect(Collectors.joining(", "));
    }

    public String printMovies() {
        return actorList.stream()
                .map(Actor::getPlayedIn)
                .flatMap(Collection::stream) // Here we have a Stream<List<Movie>> so we need to flatten it to get Stream<Movie>
                .map(Movie::toString)
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public String printActorsWhoPlayedIn(String movieName) {
        return actorList.stream()
                .filter(actor -> actor.getPlayedIn().stream()
                        .map(Movie::getName)
                        .filter(name -> name.contains(movieName))
                        .findAny()
                        .isPresent())
                .map(Actor::toString)
                .collect(Collectors.joining(", "));
    }

    public String printMoviesByYear(int movieYear) {
        return actorList.stream()
                .map(Actor::getPlayedIn)
                .flatMap(Collection::stream) // We convert Stream<List<Movie>> to Stream<Movie>
                .filter(movie -> movie.getYear() == movieYear)
                .map(Movie::toString)
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public Map<Integer,Set<String>> retrieveMovieByYear() {
        Map<Integer, Set<String>> movieByYear = new HashMap<>();
        for (Actor actor : actorList) {
            for (Movie movie : actor.getPlayedIn()) {
                if (movieByYear.get(movie.getYear()) == null) {
                    movieByYear.put(movie.getYear(), new HashSet<>());
                }
                movieByYear.get(movie.getYear()).add(movie.getName());
            }
        }
        return movieByYear;
    }

    public Map<String,List<Actor>> retrieveActorsByMovie() {
        Map<String, List<Actor>> actorsByMovie = new HashMap<>();
        for (Actor actor : actorList) {
            for (Movie movie : actor.getPlayedIn()) {
                actorsByMovie.putIfAbsent(movie.toString(), new ArrayList<>());
                actorsByMovie.get(movie.toString()).add(actor);
            }
        }
        return actorsByMovie;
    }
}
