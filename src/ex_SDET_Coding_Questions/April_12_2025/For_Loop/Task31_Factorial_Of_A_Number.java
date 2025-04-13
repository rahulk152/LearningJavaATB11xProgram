package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

import java.util.Scanner;

public class Task31_Factorial_Of_A_Number {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the Number to check the Factorial : ");
       int num = scanner.nextInt();
       int factorial = 1;
       for (int i = 1; i <= num ; i++) {
           factorial = factorial * i;
       }
       System.out.print("Factorial of the Number is : ");
       System.out.println(factorial);
    }
}
