
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("Give points [0-100]:");
        int score = Integer.valueOf(scan.nextLine());
        
        // Initialize variable
        String result = "";
        
        // Determine result for score
        if (score < 0) {
            result = "impossible!";
        } else if (score >= 0 && score < 50) {
            result = "failed";
        } else if (score >= 50 && score < 60) {
            result = "1";
        } else if (score >= 60 && score < 70) {
            result = "2";
        } else if (score >= 70 && score < 80) {
            result = "3";
        } else if (score >= 80 && score < 90) {
            result = "4";
        } else if (score >= 90 && score <= 100) {
            result = "5";
        } else if (score > 100) {
            result = "incredible!";
        }
        
        // Print result
        System.out.println("Grade: " + result);

    }
}
