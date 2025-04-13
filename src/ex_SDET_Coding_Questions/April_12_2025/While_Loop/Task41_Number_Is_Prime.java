package ex_SDET_Coding_Questions.April_12_2025.While_Loop;

import java.util.Scanner;

public class Task41_Number_Is_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it's Prime : ");
        int num = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (i<num) {
            if (num%i == 0) {
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("This is a Prime Number");
        }else {
            System.out.println("This is Composite Number");
        }
    }
}
