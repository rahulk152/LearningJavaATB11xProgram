package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task05_Person_Eligible_For_Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Your are Adult and Eligible to Vote!");
        }else {
            System.out.println(" Your are Minor and Not Eligible to Vote!");
        }
    }
}
