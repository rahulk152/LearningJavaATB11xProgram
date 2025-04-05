package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task02_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number To check Even or Odd : ");
        int num = scanner.nextInt();
        if (num%2 == 0) {
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }
}
