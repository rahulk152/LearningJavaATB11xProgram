package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task08_Smallest_Of_3_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("First Number is small : " +num1);
        } else if (num2 < num3) {
            System.out.println("Second Number is small : " +num2);
        }else {
            System.out.println("Third Number is small : " +num3);
        }
    }
}
