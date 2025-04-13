package ex_SDET_Coding_Questions.April_12_2025.While_Loop;

import java.util.Scanner;

public class Task40_Factorial_Of_A_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to check the factorial : ");
        int fact = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=fact){
            factorial = factorial * i;
            i++;
        }
        System.out.print("The Factorial is : ");
        System.out.println(factorial);
    }
}
