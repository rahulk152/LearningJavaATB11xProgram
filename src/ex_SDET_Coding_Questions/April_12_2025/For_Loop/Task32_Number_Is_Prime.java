package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

import java.util.Scanner;

public class Task32_Number_Is_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it's Prime : ");
        int num = scanner.nextInt();
        int i, count = 0;
        for (i = 2; i < num; i++) {
            if (num%i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("This is a Prime Number");
        }else {
            System.out.println("This is Composite Number");
        }
    }
}
