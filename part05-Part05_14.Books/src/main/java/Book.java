import java.util.Objects;

public class Book {
    // Variables
    private String name;
    private int publicationYear;
    
    // Constructors
    /**
     * Construct the Book
     * @param name String: the book name
     * @param publicationYear int: the year the book was published
     */
    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    
    // Methods
    /**
     * Get the book name
     * @return String: the book's name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the publication year
     * @return int: the publication year
     */
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        // if the variables are in the same location they are equal
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not of type Book, they are not equal
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Cast the object into type Book and compare variables
        Book comparedBook = (Book) compared;
        return (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear);
    }
}
