package Service;

import model.Book;
import model.Library;
import org.junit.jupiter.api.Test;
import service.BookService;
import service.LibraryService;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    @Test
    void testAddBook() {
        Library library = new Library();
        Book book = new Book(1, "Dune", "Frank Herbert", 412, true);

        LibraryService.addBook(library, book);

        assertEquals(1, Library.getBooks().size());
        assertEquals("Dune", Library.getBooks().getFirst().getTitle());
    }

    @Test
    void testRemoveBook() {
        Library library = new Library();
        Book book = new Book(1, "Dune", "Frank Herbert", 412, true);

        LibraryService.addBook(library, book);

        assertEquals(1, Library.getBooks().size());

        BookService.removeBook(library, book);
        assertTrue(Library.getBooks().isEmpty());
    }
}
