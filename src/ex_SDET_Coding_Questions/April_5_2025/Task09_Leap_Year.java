package ex_SDET_Coding_Questions.April_5_2025;

import java.util.Scanner;

public class Task09_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year to check it's Leap Year : ");
        int year = scanner.nextInt();
        if (year <= 0) {
            System.out.println("Not an correct year");
        }else if (year%4 == 0) {
            System.out.println("This is leap Year");
        }else {
            System.out.println("This is not leap Year");
        }
    }
}
