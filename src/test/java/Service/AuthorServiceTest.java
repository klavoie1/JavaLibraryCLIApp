package Service;

import model.Author;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static service.AuthorService.authorLiving;

public class AuthorServiceTest {

    @Test
    void testAuthorLiving() {
        Author author = new Author(1, "Frank Herbert", "American",
                LocalDate.of(1920,10,8), LocalDate.of(1986,2,11),
                new ArrayList<>(List.of("Science Fiction")));

        authorLiving(author);

        assertEquals(LocalDate.of(1986,2,11), author.getDateOfDeath());
    }
}
