package ex_14_2D_Array;

import java.util.Scanner;

public class Lab078_Left_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number e.g n=3");
        int n = scanner.nextInt();
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
