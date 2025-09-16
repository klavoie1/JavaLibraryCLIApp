package service;

import model.Author;
import model.Book;
import model.Library;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kenneth
 */
public class LibraryService {
    Scanner scnr = new Scanner(System.in);

    public static void addBook(Library library, Book book) {
        Library.getBooks().add(book);
    }

    public static void removeBook(Library library, Book book) {
        Library.getBooks().remove(book);
    }

    public static void addAuthor(Library library, Author author) {
        Library.getAuthors().add(author);
    }

    public static void removeAuthor(Library library, Author author) {
        Library.getAuthors().remove(author);
    }

    public static ArrayList<Book> listAllBooks(Library library) {
        return new ArrayList<>(Library.getBooks()); // defensive copy
    }

    public static ArrayList<Author> listAllAuthors(Library library) {
        return new ArrayList<>(Library.getAuthors());
    }
}
