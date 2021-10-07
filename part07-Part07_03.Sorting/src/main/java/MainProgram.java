import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
    }
    
    /**
     * Find the smallest number in an array
     * @param array int[]: the array of integers
     * @return int: the smallest number in the array
     */
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    /**
     * Find the index of the smallest number in the array
     * @param array int[]: the array of integers
     * @return int: the index of the smallest number
     */
    public static int indexOfSmallest(int[] array) {
        int smallestNumber = MainProgram.smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                index = i;
            }
        }
        return index;
    }
    /**
     * Find the index of the smallest number in an array beginning from a given index value
     * @param array int[]: an array of integers
     * @param startIndex int: the starting index
     * @return int: the index value of the smallest number in the array beginning from the given index value
     */
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * Swap the index values in an array on the given index values
     * @param array int[]: the array
     * @param index1 int: the index value of the first number to be switched
     * @param index2 int: the index value of the second number to be switched
     */
    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }
}
