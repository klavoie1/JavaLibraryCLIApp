package service;

import model.Book;

/**
 * @author kenneth
 */
public class BookService {

    public static String bookSummary(Book book) {
        return "\n------------Book Summary------------\n" +
                "Title: " + book.getTitle() + ",\n" +
                "Author: " + book.getAuthor() + ",\n" +
                "# of Pages: " + book.getNumOfPages() + ",\n" +
                "Available: " + book.isAvailable();
    }

    public static void addBook(Book book) {

    }
}
