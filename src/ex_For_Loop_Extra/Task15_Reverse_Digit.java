package ex_For_Loop_Extra;

import java.util.Scanner;

public class Task15_Reverse_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        int a = num;
        int rev = 0;
        int rem = 0;
        //456 reverse is 654
        for (int i = 0; i < num; i++) {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;

        }
        System.out.println("Given Digits :" + a);
        System.out.println("Reverse Digits :" + rev);
    }
}
