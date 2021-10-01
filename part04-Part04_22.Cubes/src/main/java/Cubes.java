
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        // Initialize classes and objects
        Scanner scanner = new Scanner(System.in);

        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            int cube = (int) Math.pow(Double.parseDouble(input), 3);
            System.out.println(cube);
        }
    }
}
