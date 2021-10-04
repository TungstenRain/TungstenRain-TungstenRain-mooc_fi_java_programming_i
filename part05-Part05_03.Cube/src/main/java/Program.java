
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Instantiate a cube and display results
        Cube cube1 = new Cube(4);
        System.out.println(cube1.volume());
        System.out.println(cube1);
        
        System.out.println("");
        
        // Instantiate another cube
        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
