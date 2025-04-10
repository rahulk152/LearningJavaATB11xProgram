package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task16_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        int a = num;
        int rem = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Given Digits :" + a);
        System.out.println("Sum of Digits :" + sum);
    }
}
