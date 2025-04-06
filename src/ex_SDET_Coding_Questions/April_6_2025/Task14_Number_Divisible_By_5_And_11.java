package ex_SDET_Coding_Questions.April_6_2025;

import java.util.Scanner;

public class Task14_Number_Divisible_By_5_And_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To check it's divisible by 5 and 11 : ");
        int num = scanner.nextInt();

        if (num%5 ==0 && num%11 == 0) {
            System.out.println("The number is divisible by both 5 and 11");
        } else if (num%5 == 0) {
            System.out.println("The Number is divisible by 5");
        } else if (num%11 == 0) {
            System.out.println("The Number is divisible by 11");
        } else {
            System.out.println("The Number is not divisible by both 5 and 11");
        }
    }

}
