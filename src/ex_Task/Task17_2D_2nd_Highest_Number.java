package ex_Task;

import java.util.Scanner;

public class Task17_2D_2nd_Highest_Number {
    public static void main(String[] args) {
        // Ask for number of rows and columns
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of Column : ");
        int cols = scanner.nextInt();

        // Declare the 2D array
        int[][] array = new int[rows][cols];

        // Input values into the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at ["+ i + "]" + "[" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }

        }
        // Display the 2D array
        System.out.println("\nThe entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Initialize max and second max values
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        // Find max and second max
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    sec_max = max;  // Update second max before changing max
                    max = array[i][j];
                } else if (array[i][j] > sec_max && array[i][j] != max) {
                    sec_max = array[i][j];
                }
            }
        }

        // Print results
        System.out.println("\nMax number is: " + max);
        if (sec_max == Integer.MIN_VALUE) {
            System.out.println("No second highest number found.");
        } else {
            System.out.println("Second max number is: " + sec_max);
        }
            
    }
}

