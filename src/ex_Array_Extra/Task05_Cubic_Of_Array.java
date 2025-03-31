package ex_Array_Extra;

import java.util.Scanner;

public class Task05_Cubic_Of_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array element lenght : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Element of a[%d] :", i);
            a[i] = scanner.nextInt();

        }
        System.out.println("\nCubic Array Elements...\n");
            int cube1 =0;
            int cube;
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]*a[j]*a[j]);
            cube = a[j]*a[j]*a[j];
            cube1 = cube1 + cube;


        }
        System.out.println("The Sum of Cube is " +cube1);
    }
}
