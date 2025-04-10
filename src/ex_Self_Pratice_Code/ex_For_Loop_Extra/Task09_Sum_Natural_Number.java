package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task09_Sum_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit of Natural Number to sum : ");
        int s = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= s; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        scanner.close();
    }
}
