import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Instantiate ArrayLists
        ArrayList<Integer> intArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        
        // Initialize
        int[] intArray = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"This", "is","a", "fun", "ride"};
        
        for (int number : intArray) {
            intArrayList.add(number);
        }
        for (String string : stringArray) {
            stringArrayList.add(string);
        }
        
        System.out.println(Arrays.toString(intArray));
        sort(intArray);
        System.out.println(Arrays.toString(intArray));
        
        System.out.println("");
        System.out.println(Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        
        System.out.println("");
        for (int num : intArrayList) {
            System.out.println(num);
        }
        sortIntegers(intArrayList);
        System.out.println("");
        for (int num : intArrayList) {
            System.out.println(num);
        }
        
        System.out.println("");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        sortStrings(stringArrayList);
        System.out.println("");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}