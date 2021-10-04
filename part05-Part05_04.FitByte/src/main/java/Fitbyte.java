/**
 * Fitbyte Class for Part05_04
 * @author frank
 */
public class Fitbyte {
    // Variables
    private int age;
    private int restingHeartRate;
    
    // Constructors
    /**
     * Construct the Fitbyte class
     * @param age int: the age
     * @param restingHeartRate int: the resting heart rate
     */
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    // Methods
    /**
     * Get the target heart rate
     * @param percentageOfMaximum double: the percentage of the maximum
     * @return double: the target heart rate
     */
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        
        return (maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
