
public class Main {

    public static void main(String[] args) {
        // Instantiate SimpleDates and Persons
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        // Determine if leo is the same as lily
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }
        
        // Instantiate new Person
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
        
        // Determine if they are the same
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
