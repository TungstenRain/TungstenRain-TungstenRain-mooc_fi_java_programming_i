
public class Program {

    public static void main(String[] args) {
        // Instantiate Fitbyte Class
        Fitbyte assistant = new Fitbyte(30, 60);
        
        // Initialize variable
        double percentage = 0.5;
        
        // Increment up to the limit of the maximum heart rate
        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum " + target);
            percentage+= 0.1;
        }
    }
}
