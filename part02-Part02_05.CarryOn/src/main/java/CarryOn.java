
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create loop requesting: Shall we carry on? Only "no" will break the loop
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }
        }
    }
}
