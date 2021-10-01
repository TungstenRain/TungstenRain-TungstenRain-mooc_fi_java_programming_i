/**
 * Book class for part04_20
 * @author frank
 */
public class Book {
    // Variables
    private String title;
    private int pages;
    private int publicationYear;
    
    // Constructors
    /**
     * Construct the class
     * @param title String: the book's title
     * @param pages int: the number of pages in the book
     * @param publicationYear int: the year the book was published
     */
    public Book (String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    // Methods
    /**
     * Get the book title
     * @return String: the book title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Get the number of pages in the book
     * @return int: the number of pages in the book
     */
    public int getPages() {
        return pages;
    }
    /**
     * Get the book's publication year
     * @return int: the book's publication year
     */
    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    /**
     * Return the string in the following format
     * [Title], [pages] pages, [publicationYear]
     */
    public String toString() {
        return (this.title + ", " + this.pages + " pages, " + this.publicationYear);
    }
}
