package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task01_Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.println("This is a Positive Number!");
        }else {
            System.out.println("This is a Negative Number!");
        }
    }
}
