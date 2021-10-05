
public class Main {

    public static void main(String[] args) {
        // Instantiate the Stack
        Stack s = new Stack();
        
        // Add items to the Stack
        s.add("gibberish");
        s.add("more gibberish");
        s.add("more gibberish");
        s.add("stuff");
        s.add("stuff");
        
        // Verify it's not empty and print the results
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        // Take the last item
        String taken = s.take();
        
        // Verify it's not empty and print results
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
    }
}
