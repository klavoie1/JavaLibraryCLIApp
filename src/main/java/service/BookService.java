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
        boolean notCompleted = true;

        while(notCompleted) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter Book Title: ");
            book.setTitle(scnr.nextLine());
            System.out.println("Enter the Books Author: ");
            book.setAuthor(scnr.nextLine());
            System.out.println("Enter the total number of pages: ");
            book.setNumOfPages(Integer.parseInt(scnr.nextLine()));
            System.out.println("Is this book available (true or false): ");
            book.setAvailable(scnr.nextBoolean());
            notCompleted = false;


            Library.getBooks().add(book);
        }
    }
}
