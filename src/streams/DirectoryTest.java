package streams;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by ubu on 03/12/16.
 */
public class DirectoryTest {
    private Directory directory;

    @Before
    public void setUpDatas() {
        directory = new Directory();

        final Actor josiane = new Actor("Josiane", "Balasko");
        josiane.addMovie(new Movie("Les bronzés", 1978));
        josiane.addMovie(new Movie("Didier", 1997));
        josiane.addMovie(new Movie("Madame Édouard", 2004));
        josiane.addMovie(new Movie("Beur sur la ville", 2011));
        directory.add(josiane);

        final Actor christian = new Actor("Christian", "Clavier");
        christian.addMovie(new Movie("Les bronzés", 1978));
        christian.addMovie(new Movie("Les visiteurs", 1993));
        christian.addMovie(new Movie("Astérix et Obélix contre César", 1999));
        christian.addMovie(new Movie("L'Enquête Corse", 2004));
        directory.add(christian);

        final Actor gerard = new Actor("Gérard", "Jugnot");
        gerard.addMovie(new Movie("Les bronzés", 1978));
        gerard.addMovie(new Movie("Scout toujours...", 1985));
        gerard.addMovie(new Movie("Les choristes", 2004));
        gerard.addMovie(new Movie("Beur sur la ville", 2011));
        directory.add(gerard);

        final Actor michel = new Actor("Michel", "Blanc");
        michel.addMovie(new Movie("Les bronzés", 1978));
        michel.addMovie(new Movie("Retenez-moi... ou je fais un malheur !", 1983));
        michel.addMovie(new Movie("Madame Édouard", 2004));
        michel.addMovie(new Movie("La Fille du RER", 2009));
        directory.add(michel);
    }

    @Test
    public void testAddingPeople() {
        int directoryLength = directory.actorList.size();
        directory.add(new Actor("Jean", "Dujardin"));
        assertEquals("It should add people to the directory", directory.actorList.size(), directoryLength + 1);
    }

    @Test
    public void testToString() {
        assertEquals("It should print actors' name",
                "Josiane Balasko, Christian Clavier, Gérard Jugnot, Michel Blanc",
                directory.toString());
    }

    @Test
    public void testPrintOrderedByName() {
        assertEquals("It should sort people by last name and print them",
                "Josiane Balasko, Michel Blanc, Christian Clavier, Gérard Jugnot",
                directory.printOrderedByName());
    }

    @Test
    public void testPrintMovies() {
        assertEquals("It should print movies name without duplicates",
                "Les bronzés, Didier, Madame Édouard, Beur sur la ville, Les visiteurs, Astérix et Obélix contre César, L'Enquête Corse, Scout toujours..., Les choristes, Retenez-moi... ou je fais un malheur !, La Fille du RER",
                directory.printMovies());
    }

    @Test
    public void testPrintActorsWhoPlayedInAMovie() {
        assertEquals("It should search a movie and print actors who played in that movie",
                "Josiane Balasko, Christian Clavier, Gérard Jugnot, Michel Blanc",
                directory.printActorsWhoPlayedIn("bronzés"));
        assertEquals("It should search a movie and print actors who played in that movie",
                "Josiane Balasko, Michel Blanc",
                directory.printActorsWhoPlayedIn("Édouard"));
    }

    @Test
    public void testPrintMoviesByYear() {
        assertEquals("It should print movies' name of 1978",
                "Les bronzés",
                directory.printMoviesByYear(1978));

        assertEquals("It should print movies' name of 2004",
                "Madame Édouard, L'Enquête Corse, Les choristes",
                directory.printMoviesByYear(2004));
    }

    @Test
    public void testGroupMovieByYear() {
        Map<Integer, Set<Movie>> movieByYear = directory.retrieveMovieByYear();
        assertEquals("It should ",
                "[Les bronzés]",
                movieByYear.get(1978).toString());

        assertEquals("It should ",
                "[Madame Édouard, L'Enquête Corse, Les choristes]",
                movieByYear.get(2004).toString());
    }

    @Test
    public void testGroupActorsByMovie() {
        Map<String, List<Actor>> actorsByMovie = directory.retrieveActorsByMovie();
        assertEquals("It should ",
                "[Josiane Balasko, Christian Clavier, Gérard Jugnot, Michel Blanc]",
                actorsByMovie.get("Les bronzés").toString());

        assertEquals("It should ",
                "[Josiane Balasko, Michel Blanc]",
                actorsByMovie.get("Madame Édouard").toString());

        assertEquals("It should ",
                "[Gérard Jugnot]",
                actorsByMovie.get("Les choristes").toString());
    }
}