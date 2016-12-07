package streams;

import java.util.*;

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

    private String printList(Collection listToPrint) {
        StringBuilder directoryAsString = new StringBuilder();
        int counter = 0;
        for (Object object : listToPrint) {
            directoryAsString.append(object.toString());
            if (++counter < listToPrint.size()) {
                directoryAsString.append(", ");
            }
        }
        return directoryAsString.toString();
    }

    public String printOrderedByName() {
        List<Actor> actors = new ArrayList<>(actorList);
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return printList(actors);
    }

    public String printMovies() {
        Set<String> movies = new LinkedHashSet<>();
        for (Actor actor : actorList) {
            for (Movie movie : actor.getPlayedIn()) {
                movies.add(movie.toString());
            }
        }
        return printList(movies);
    }

    public String printActorsWhoPlayedIn(String movieName) {
        Set<String> actors = new LinkedHashSet<>();
        for (Actor actor : actorList) {
            for (Movie movie : actor.getPlayedIn()) {
                if (movie.getName().contains(movieName)) {
                    actors.add(actor.toString());
                }
            }
        }
        return printList(actors);
    }

    public String printMoviesByYear(int year) {
        Set<String> movies = new LinkedHashSet<>();
        for (Actor actor : actorList) {
            for (Movie movie : actor.getPlayedIn()) {
                if (movie.getYear() == year) {
                    movies.add(movie.toString());
                }
            }
        }
        return printList(movies);
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
                if (actorsByMovie.get(movie.toString()) == null) {
                    actorsByMovie.put(movie.toString(), new ArrayList<Actor>());
                }
                actorsByMovie.get(movie.toString()).add(actor);
            }
        }
        return actorsByMovie;
    }
}
