import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instantiate classes and objects
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        // Request and capture user input
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication Year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            // Initialize class and store in arrayList
            library.add(new Book(title, pages, publicationYear));
        }
        
        // Request information from user
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        
        if (input.equals("everything")) {
            for (Book book : library) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book : library) {
                System.out.println(book.getTitle());
            }
        }

    }
}
