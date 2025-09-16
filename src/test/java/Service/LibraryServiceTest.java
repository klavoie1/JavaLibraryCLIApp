package Service;

import model.Author;
import model.Book;
import model.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryServiceTest {

    @Test
    void testAddBook() {
        Library library = new Library();
        Book book = new Book(1, "Dune", "Frank Herbert", 412, true);

        library.getBooks().add(book);

        assertEquals(1, library.getBooks().size());
        assertEquals("Dune", library.getBooks().getFirst().getTitle());
    }

    @Test
    void testRemoveBook() {
        Library library = new Library();
        Book book = new Book(1, "Dune", "Frank Herbert", 412, true);

        library.getBooks().add(book);

        assertEquals(1, library.getBooks().size());
        assertEquals("Dune", library.getBooks().getFirst().getTitle());

        Library.getBooks().remove(book);

        assertTrue(Library.getBooks().isEmpty());
    }

    @Test
    void testAddAuthor() {
        Library library = new Library();
        Author author = new Author(1, "Frank Herbert", "American",
                LocalDate.of(1920,10,8), LocalDate.of(1986,2,11),
                new ArrayList<>(List.of("Science Fiction")));

        library.getAuthors().add(author);

        assertEquals(1, library.getAuthors().size());
        assertEquals("Frank Herbert", library.getAuthors().getFirst().getName());
    }

    @Test
    void testRemoveAuthor() {
        Library library = new Library();
        Author author = new Author(1, "Frank Herbert", "American",
                LocalDate.of(1920,10,8), LocalDate.of(1986,2,11),
                new ArrayList<>(List.of("Science Fiction")));

        library.getAuthors().add(author);

        assertEquals(1, library.getAuthors().size());
        assertEquals("Frank Herbert", library.getAuthors().getFirst().getName());

        library.getAuthors().remove(author);

        assertTrue(library.getAuthors().isEmpty());
    }
}
