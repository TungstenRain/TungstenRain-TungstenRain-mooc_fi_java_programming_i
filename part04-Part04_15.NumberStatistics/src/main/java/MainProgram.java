
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // Instantiate objects
        Scanner scanner = new Scanner(System.in);
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        // Request user input
        System.out.println("Enter numbers:");
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0){
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
            total.addNumber(num);
        }
        
        // Display results to user
        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }        
        
}
