package ex_SDET_Coding_Questions.April_6_2025;

import java.util.Scanner;

public class Task15_Convert_Days_into_Years_Months_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Days : ");
        int totalDays  = scanner.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("\nEquivalent is:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

    }
}
