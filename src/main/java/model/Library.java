package model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Author> authors;

    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public Library(ArrayList<Book> listOfBooks, ArrayList<Author> listOfAuthors) {
        this.books = new ArrayList<>(listOfBooks);
        this.authors = new ArrayList<>(listOfAuthors);
    }

    public ArrayList<Book> getBooks() { return books; }

    public ArrayList<Author> getAuthors() { return authors; }
}
