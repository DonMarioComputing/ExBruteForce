package apps;

import utils.ArrayUtils;
import java.util.Scanner;

public class ArrayManipulation {

//Exercise 2.2) Using Your Method

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] grades = new int[10];

            //Ask user for 10 grades
            for (int i = 0; i < grades.length; i++) {
                grades[i] = getValidInteger(scanner, "Enter grade " + (i + 1) + ": ");
            }

            //Calculate average
            double average = ArrayUtils.calcAverage(grades);

            //Display GPA
            System.out.println("Your GPA (average grade) is: " + average);
        }

         /**
         * Gets a valid integer from the user
         * @param scanner the Scanner object to read input
         * @param prompt  the message to display to the user
         * @return a valid integer entered by the user
         */
        private static int getValidInteger(Scanner scanner, String prompt) {
            int value;
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    // clear invalid input
                    scanner.next();
                }
            }
            return value;
        }
    }

