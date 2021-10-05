
public class Main {

    public static void main(String[] args) {
        // Instantiate the Classes
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        
        // Display results to user
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println("");
        
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
