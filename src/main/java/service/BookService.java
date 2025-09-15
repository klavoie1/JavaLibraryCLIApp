package service;

import model.Book;
import model.Library;

import java.util.Scanner;

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

    public static void addBook(Library library, Book book) {
        Library.getBooks().add(book);
    }

    public static void removeBook(Library library, Book book) {
        Library.getBooks().remove(book);
    }

    public static void addBookFromInput(Library library) {
        Scanner scnr = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Enter Book Title: ");
        book.setTitle(scnr.nextLine());

        System.out.println("Enter the Books Author: ");
        book.setAuthor(scnr.nextLine());

        System.out.println("Enter the total number of pages: ");
        book.setNumOfPages(Integer.parseInt(scnr.nextLine()));

        System.out.println("Is this book available (true or false): ");
        book.setAvailable(scnr.nextBoolean());

        addBook(library, book);
    }
}
