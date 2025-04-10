package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task01_Print_All_N_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number till when you want to print : ");
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
