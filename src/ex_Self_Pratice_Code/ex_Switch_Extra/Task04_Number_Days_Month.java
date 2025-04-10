package ex_Self_Pratice_Code.ex_Switch_Extra;

import java.util.Scanner;

public class Task04_Number_Days_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for month
        System.out.print("Enter the Month (1-12): ");
        int month = scanner.nextInt();

        // Taking user input for year to check leap year
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();

        int days;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                // Check for leap year
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                days = isLeap ? 29 : 28;
            }
            default -> {
                System.out.println("Invalid month! Please enter a number between 1 and 12.");
                return; // Exit the program for invalid input
            }
        }

        System.out.println("Number of Days: " + days);
    }
}
