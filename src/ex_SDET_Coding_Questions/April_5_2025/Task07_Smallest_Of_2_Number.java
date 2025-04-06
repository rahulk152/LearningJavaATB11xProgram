package ex_SDET_Coding_Questions.April_5_2025;

import java.util.Scanner;

public class Task07_Smallest_Of_2_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        if(num1 < num2){
            System.out.println("First Number is smallest!");
        }else {
            System.out.println("Second Number is Smallest!");
        }
    }
}
