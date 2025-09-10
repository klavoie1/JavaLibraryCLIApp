import model.Author;
import model.Book;

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
                new ArrayList<>(List.of("Science Fiction, Hard Science, Space Opera, Classic")));

        Author andyWeir = new Author(2, "Andy Weir", "American",
                LocalDate.of(1972,6,16),
                null,
                new ArrayList<>(List.of("Science Fiction, Fantasy")));

        System.out.println(foundation.toString());
        System.out.println(isaacAsimov.toString());

        System.out.println(isaacAsimov.authorAge(isaacAsimov.getDateOfBirth(), isaacAsimov.getDateOfDeath()));
        System.out.println(andyWeir.authorAge(andyWeir.getDateOfBirth(),isaacAsimov.getDateOfDeath()));


    }
}
