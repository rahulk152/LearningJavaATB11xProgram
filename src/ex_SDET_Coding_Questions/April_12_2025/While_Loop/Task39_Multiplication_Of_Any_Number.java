package ex_SDET_Coding_Questions.April_12_2025.While_Loop;

import java.util.Scanner;

public class Task39_Multiplication_Of_Any_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for which you want to know the table : ");
        int table_num = scanner.nextInt();
        int i = 1;
        while (i<=10){
            System.out.printf(table_num+" * "+i+" = "+(table_num*i)+"\n");
            i++;
        }
    }
}
