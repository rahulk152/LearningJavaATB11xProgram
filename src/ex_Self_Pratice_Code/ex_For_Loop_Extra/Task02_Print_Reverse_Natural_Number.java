package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task02_Print_Reverse_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from which the reverse will start : ");
        int n = scanner.nextInt();
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
