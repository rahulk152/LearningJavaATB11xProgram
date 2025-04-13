package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

import java.util.Scanner;

public class Task34_Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to print the Inverted Star format : ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
