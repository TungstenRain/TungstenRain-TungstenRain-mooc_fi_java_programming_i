import java.util.ArrayList;

public class ExerciseManagement {
    // Variables
    private ArrayList<Exercise> exercises;
    
    // Constructors
    /**
     * Construct the ExerciseManagement
     */
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    // Methods
    /**
     * Return a list of all the exercise names
     * @return ArrayList<String>: a list of all the exercise names
     */
    public ArrayList<String> exerciseList() {
        // Instantiate ArrayList
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }
    /**
     * Add an exercise to the ExerciseManager
     * @param exercise String: the exercise name
     */
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    /**
     * Set the exercise as completed
     * @param exercise 
     */
    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }
    /**
     * Determine if the exercise is completed
     * @param exercise String: the exercise name
     * @return boolean: true if completed; false otherwise
     */
    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
