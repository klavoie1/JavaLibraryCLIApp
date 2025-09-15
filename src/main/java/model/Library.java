package model;

import java.util.ArrayList;
/**
 * @author kenneth
 */
public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Author> authors;

    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public Library(ArrayList<Book> listOfBooks, ArrayList<Author> listOfAuthors) {
        books = new ArrayList<>(listOfBooks);
        authors = new ArrayList<>(listOfAuthors);
    }

    public static ArrayList<Book> getBooks() { return books; }

    public static ArrayList<Author> getAuthors() { return authors; }
}
