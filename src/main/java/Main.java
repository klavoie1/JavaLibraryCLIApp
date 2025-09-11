import model.Author;
import model.Book;
import service.AuthorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book foundation = new Book(1, "Foundation", "Isaac Asimov",
                296, true);

        Author isaacAsimov = new Author(1, "Isaac Asimov", "American",
                LocalDate.of(1920, 1,2),
                LocalDate.of(1992, 4, 6),
                new ArrayList<>(List.of("Science Fiction, Hard Science, Space Opera")));

        Author andyWeir = new Author(2, "Andy Weir", "American",
                LocalDate.of(1972,6,16),
                null,
                new ArrayList<>(List.of("Science Fiction, Fantasy")));

        Author testAuthor = new Author(3, "Test", "Test",
                LocalDate.of(1900,1,1),
                null,
                new ArrayList<>(List.of()));

        System.out.println(foundation.toString());
        System.out.println(isaacAsimov.toString());
        System.out.println(testAuthor.toString());

        System.out.println(AuthorService.authorAge(isaacAsimov));
        System.out.println(AuthorService.authorAge(andyWeir));
        System.out.println(AuthorService.authorAge(testAuthor));

        System.out.println(AuthorService.authorSummary(isaacAsimov));
        System.out.println(AuthorService.authorSummary(andyWeir));

        AuthorService.addGenre(isaacAsimov, "test");

        System.out.println(isaacAsimov.getGenres());

        AuthorService.removeGenre(isaacAsimov, "test");

        System.out.println(isaacAsimov.getGenres());

        AuthorService.removeGenre(isaacAsimov, "test");

        AuthorService.listGenres(isaacAsimov);

        AuthorService.listGenres(testAuthor);
    }
}
