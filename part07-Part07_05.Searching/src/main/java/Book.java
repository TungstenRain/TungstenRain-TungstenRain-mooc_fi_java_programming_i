
public class Book {
    // Variables
    private int id;
    private String name;
    
    // Constructors
    /**
     * Construct the Book
     * @param id int: the book id
     * @param name String: the book name
     */
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Methods
    /**
     * Get the book id
     * @return int: the book id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Get the book name
     * @return String: the book name
     */
    public String getName() {
        return name;
    }

    @Override
    /**
     * Return a String in the following format:
     * (id: [id]; name: [name])
     */
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}
