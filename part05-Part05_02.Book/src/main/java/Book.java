/**
 * Book Class for Part05_02
 * @author frank
 */
public class Book {
    // Variables
    private String author;
    private String title;
    private int pages;
    
    // Constructors
    /**
     * Construct the Book
     * @param author String: the book's author
     * @param title String: the book's title
     * @param pages int: the number of pages in the book
     */
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
    
    // Methods
    /**
     * Get the author's name
     * @return String: the author's name
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Get the book's title
     * @return String: the book's title
     */
    public String getName() {
        return title;
    }
    /**
     * Get the number of pages in the book
     * @return int: the number of pages in the book
     */
    public int getPages() {
        return pages;
    }
    
    @Override
    /**
     * Return the Book information in the following format
     * [author], [title], [pages] pages
     */
    public String toString() {
        return author + ", " + title + ", " + pages + " pages";
    }
}
