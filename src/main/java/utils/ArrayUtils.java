package utils;

public class ArrayUtils {

//Exercise 1.1) Displaying all elements in a numeric array

    /**
     * Displays all elements in an integer array along with their positions.
     * @param arr the integer array to display
     */
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

//Exercise 1.2) Displaying all elements in a String array
    /**
     * Displays all elements in a String array along with their positions.
     * @param arr the String array to display
     */
    public static void displayArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

//Exercise 2.1) Calculating the average of an array
    /**
     * Calculates the average of all elements in an integer array.
     * @param arr the integer array to calculate the average of
     * @return the average value as a double
     */
    public static double calcAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

}

//public static double calcAverage(int [] nums){
//double total=0;
//for (int num: num){
//total += num;
//}
//return total/nums.length;}



//Exercise 3.1) Finding the maximum number in an array

