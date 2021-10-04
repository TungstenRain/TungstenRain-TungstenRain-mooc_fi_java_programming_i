
public class MainProgram {

    public static void main(String[] args) {
        // Instantiate the Counter
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(100);
        
        counter1.increase();
        counter1.increase(15);
        counter1.increase();
        counter1.increase(-2);
        
        counter2.decrease();
        counter2.decrease(45);
        counter2.decrease();
        counter2.increase(4);
        
        System.out.println(counter1);
        System.out.println(counter2);
    }
}
