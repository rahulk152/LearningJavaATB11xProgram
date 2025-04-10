package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task08_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number limit : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
