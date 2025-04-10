package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task13_Factorial_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to know the Factorial : ");
        int f = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial : " +fact);
    }
}
