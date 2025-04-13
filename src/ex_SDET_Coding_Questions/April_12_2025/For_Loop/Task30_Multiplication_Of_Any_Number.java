package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

import java.util.Scanner;

public class Task30_Multiplication_Of_Any_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number for which you want to print the table : ");
        int table_num = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf(table_num+" * "+i+" = "+(table_num*i)+"\n");
        }
    }
}
