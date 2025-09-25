package utils;

public class ArrayUtils {

//Exercise 1.1) Displaying all elements in a numeric array

    /**
     * Displays all elements in an integer array along with their positions.
     *
     * @param arr the integer array to display
     */
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

}




