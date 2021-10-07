import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ExerciseManagementTest {
    // Variables
    private ExerciseManagement management;
    
    // Methods
    @Before
    /**
     * Initialize the ExerciseManagement
     */
    public void initialize() {
        this.management = new ExerciseManagement();
    }
    
    @Test
    /**
     * Determine if the exercise list is empty when it is instantiated
     */
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    /**
     * Determine if adding a new exercise grows the list by one
     */
    public void addingExerciseGrowsListByOne() {
        this.management.add("Write a test");
        assertEquals(1, this.management.exerciseList().size());
    }
    
    @Test
    /**
     * Determine if the added exercise is in the list
     */
    public void addedExerciseIsInList() {
        this.management.add("Write a test");
        assertTrue(this.management.exerciseList().contains("Write a test"));
    }
    
    @Test
    /**
     * Determine if the exercise can be marked as completed
     */
    public void exerciseCanBeMarkedAsCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        assertTrue(this.management.isCompleted("New exercise"));
    }
    
    @Test
    /**
     * Determine if the exercise is not marked as completed, it is not completed
     */
    public void ifNotMarkedAsCompletedIsNotCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        assertFalse(this.management.isCompleted("Some exercise"));
    }
}
