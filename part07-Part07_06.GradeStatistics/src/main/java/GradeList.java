/**
 * GradeList Class for Part07_06
 * @author frank
 */
import java.util.ArrayList;

public class GradeList {
    // Variables
    private ArrayList<Integer> allScores;
    private ArrayList<Integer> passingScores;
    private int[] gradeDistribution;
    
    /**
     * NOTE:
     * The gradeDistribution array is as follows:
     * gradeDistribution[5] = number of grades with scores over 90
     * gradeDistribution[4] = number of grades with scores between 80 and 89
     * gradeDistribution[3] = number of grades with scores between 70 and 79
     * gradeDistribution[2] = number of grades with scores between 60 and 69
     * gradeDistribution[1] = number of grades with scores between 50 and 59
     * gradeDistribution[0] = number of grades with scores below 50
     */
    
    // Constructors
    /**
     * Construct the GradeList
     */
    public GradeList() {
        this.allScores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
        this.gradeDistribution = new int[6];
    }
        
    // Methods
    /**
     * Add points to the GradeList
     * @param points int: the score (points) to be added
     * Note: A score of 50 or more is considered passing
     */
    public void add(int points) {
        if (points < 0 || points > 100) {
            return;
        }
        this.allScores.add(points);
        this.addToGradeDistribution(points);
        if (points >= 50) {
            this.passingScores.add(points);
        }
    }
    
    /**
     * Get the average of all scores
     * @return double: the average of all scores; -1 if there are no scores
     */
    public double averageOfAllScores() {
        return averageOfList(this.allScores);
    }
    
    /**
     * Get the average of all passing scores (passing score is 50 or higher)
     * @return double: the average of passing scores; -1 if there are no passing scores
     */
    public double averageOfPassingScores() {
        return averageOfList(this.passingScores);
    }
    
    /**
     * Get the average value in an ArrayList<Integer>
     * @param list ArrayList<Integer>: the ArrayList to get the average from
     * @return double: the average; -1 if empty
     */
    private double averageOfList(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int score : list) {
            sum+= score;
        }
        return (double) sum / list.size();
    }
    
    /**
     * Get the value of the average of passing scores in String format
     * @return String: the average of the passing scores; "-" if there are no passing scores
     */
    public String valueOfAverageOfPassingScores() {
        double average = averageOfPassingScores();
        if (average == -1 || average == 0) {
            return "-";
        }
        return String.valueOf(average);
    }
    
    /**
     * Determine the percentage of passing scores
     * @return double: the percentage of passing scores; -1 if there are no scores
     */
    public double passPercentage() {
        if (this.allScores.isEmpty()) {
            return -1;
        }
        if (this.passingScores.isEmpty()) {
            return 0.0;
        }
        return 100 * (double) this.passingScores.size() / this.allScores.size();
    }
    
    /**
     * Add to the grade distribution
     * @param points int: the score received
     */
    private void addToGradeDistribution(int points) {
        if (points < 50) {
            this.gradeDistribution[0]++;
        } else if (points >= 50 && points < 60) {
            this.gradeDistribution[1]++;
        } else if (points >= 60 && points < 70) {
            this.gradeDistribution[2]++;
        } else if (points >= 70 && points < 80) {
            this.gradeDistribution[3]++;
        } else if (points >= 80 && points < 90) {
            this.gradeDistribution[4]++;
        } else if (points >= 90) {
            this.gradeDistribution[5]++;
        }
    }
    
    /**
     * Print the grade distribution in stars
     */
    public void printGradeDistribution() {
        Stars.printGradeDistribution(gradeDistribution);
    }

}
