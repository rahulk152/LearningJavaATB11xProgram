package ex_Task;

import java.util.Scanner;

public class Task18_2D_Array_Even_Odd {
    public static void main(String[] args) {
// Ask for number of rows and columns
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare the 2D array
        int[][] array = new int[rows][cols];

        // Input values into the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
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



//
//        int[][] arr = {
//                {10,15,13},
//                {21,25,28},
//                {30,35,39},
//        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2 == 0) {
                    System.out.print(+array[i][j]+ "=" + "Even"+" \t");
                }else {
                    System.out.print(+array[i][j]+ "=" + "Odd"+" \t");
                }
            }
            System.out.println();

        }
    }
}
