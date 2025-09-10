package model;
/**
 * @author kenneth
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private int numOfPages;
    private boolean available;

    public Book() {
        id = 0;
        title = "unknown";
        author = "unknown";
        numOfPages = 0;
        available = false;
    }

    public Book(int bookId, String bookTitle, String bookAuthor, int totalPages, boolean bookAvailable) {
        this.id = bookId;
        this.title = bookTitle;
        this.author = bookAuthor;
        this.numOfPages = totalPages;
        this.available = bookAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + "'" +
                ", author='" + author +"'" +
                ", numOfPages=" + numOfPages +
                ", available=" + available +
                "}";

    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getNumOfPages() { return numOfPages; }

    public void setNumOfPages(int numOfPages) { this.numOfPages = numOfPages; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }
}
