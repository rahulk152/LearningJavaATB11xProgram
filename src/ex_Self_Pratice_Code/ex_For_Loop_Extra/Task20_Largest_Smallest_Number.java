package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task20_Largest_Smallest_Number {
           public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int largest = Integer.MIN_VALUE; // Initialize with the smallest possible value
            int smallest = Integer.MAX_VALUE; // Initialize with the largest possible value

            System.out.println("Enter numbers (Enter -1 to stop):");

            for (;;) { // Infinite loop to keep accepting numbers
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (num == -1) { // Stop condition
                    break;
                }

                if (num > largest) {
                    largest = num;
                }
                if (num < smallest) {
                    smallest = num;
                }
            }

            // Display the results
            if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
                System.out.println("No numbers were entered.");
            } else {
                System.out.println("\nLargest Number: " + largest);
                System.out.println("Smallest Number: " + smallest);
            }

            scanner.close();
        }
}

