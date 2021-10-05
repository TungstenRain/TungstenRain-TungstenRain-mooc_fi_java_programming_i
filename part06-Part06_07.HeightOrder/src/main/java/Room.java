/**
 * Room Class for Part06_07
 * @author frank
 */
import java.util.ArrayList;

public class Room {
    // Variables
    private ArrayList<Person> persons;
    
    // Constructors
    /**
     * Construct the Room
     */
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a person to the Room
     * @param person Person: the person to be added
     */
    public void add(Person person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }
    /**
     * Determine if the Room is empty
     * @return boolean: true if empty; false otherwise
     */
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    /**
     * Get the people in the Room
     * @return ArrayList<Person>: the list of Persons in the Room
     */
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    /**
     * Get the shortest Person in the Room
     * @return Person: the shortest Person in the Room
     */
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person shortest = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    /**
     * Remove and return the shortest Person in the Room
     * @return Person: the shortest Person in the Room
     */
    public Person take() {
        if (persons.isEmpty()){
            return null;
        }
        
        Person theShortest = this.shortest();
        this.persons.remove(theShortest);
        return theShortest;
    }
}
