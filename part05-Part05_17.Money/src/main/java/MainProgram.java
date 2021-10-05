
public class MainProgram {

    public static void main(String[] args) {
        // Instantiate Money Classes
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);
        Money c = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        if (b.lessThan(c)) {
            System.out.println(b + " is less than " + c);
        } else {
            System.out.println(b + " is not less than " + c);
        }
        
        Money d = c.minus(a);
        Money e = b.minus(a);
        Money f = a.minus(b);
        
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
