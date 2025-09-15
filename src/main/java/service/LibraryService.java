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

    public void removeBook(Library library, Book book) {
        Library.getBooks().remove(book);
    }

    public void addAuthor(Library library, Author author) {
        Library.getAuthors().add(author);
    }

    public void removeAuthor(Library library, Author author) {
        Library.getAuthors().remove(author);
    }

    public ArrayList<Book> listAllBooks(Library library) {
        return new ArrayList<>(Library.getBooks()); // defensive copy
    }

    public ArrayList<Author> listAllAuthors(Library library) {
        return new ArrayList<>(Library.getAuthors());
    }
}
