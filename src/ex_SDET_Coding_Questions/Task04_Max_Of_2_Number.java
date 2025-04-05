package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task04_Max_Of_2_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println("First Number is max!");
        }else {
            System.out.println("Second Number is max!");
        }
    }
}
