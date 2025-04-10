package ex_Self_Pratice_Code.ex_Array_Extra;

import java.util.Scanner;

public class Task08_Copy_ElemetOfOneTo_Another_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array lenght : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        //int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Element of a[%d] :", i);
            a[i] = scanner.nextInt();


        }

        int[] b = new int[n];
        for (int i = 0; i < n ; i++) {
            b[i] = a[i];
            System.out.println("Copied Array is : " +b[i]);
        }


    }
}
