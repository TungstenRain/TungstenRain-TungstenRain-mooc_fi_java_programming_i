import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instantiate classes and objects
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user input
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            
            // Instantiate class and store in array
            programs.add(new TelevisionProgram(name, duration));
        }
        
        // Request and capture maximum duration from user
        System.out.println("Program's maximum duration? ");
        int maximumDuration = Integer.parseInt(scanner.nextLine());
        
        // Display only those programs with a duration less than the maximumDuration
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maximumDuration) {
                System.out.println(program);
            }
        }
    }
}
