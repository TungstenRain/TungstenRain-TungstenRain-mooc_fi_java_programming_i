
import java.util.ArrayList;

public class GradeRegister {
    // Variables
    private ArrayList<Integer> grades;
    private ArrayList<Integer> allPoints;
    
    // Constructors
    /**
     * Construct the GradeRegister
     */
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.allPoints = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a grade based on the points scored
     * @param points int: the points earned on the exam
     */
    public void addGradeBasedOnPoints(int points) {
        this.allPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }
    
    /**
     * Determine the number of scores that received the given grade
     * @param grade int: the grade to determine
     * @return int: the total number of grades with the given grade
     */
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    /**
     * Convert the points on the exam to a grade (5 being highest, 0 lowest)
     * @param points int: the exam score
     * @return int: the grade
     */
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    /**
     * Calculate the average of the grades
     * @return double: the average of the grades; -1 if there are no grades
     */
    public double averageOfGrades() {
        return average(this.grades);
    }
    
    /**
     * Calculate the average of the points
     * @return double: the average of the points; -1 if there are no points
     */
    public double averageOfPoints() {
        return average(this.allPoints);
    }
    
    /**
     * Calculate the average of a given ArrayList
     * @param array ArrayList<Integer>: the ArrayList to be processed
     * @return double: the average of the ArrayList; -1 if it is empty
     */
    private double average(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return -1;
        }
        
        double total = 0.0;
        int counter = 0;
        for (int score : array) {
            total+= score;
            counter++;
        }
        return (double) total / counter;
    }
}
