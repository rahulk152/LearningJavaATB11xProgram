package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

import java.util.Scanner;

public class Task36_Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to print the Inverted pyramid Star format : ");
        int rows = scanner.nextInt();
        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
