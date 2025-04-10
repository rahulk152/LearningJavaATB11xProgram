package ex_Self_Pratice_Code.ex_Array_Extra;

import java.util.Scanner;

public class Task06_Max_Min_of_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of array : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Element of a[%d] :", i);
            a[i] = scanner.nextInt();

        }
        System.out.println("\nArray Elements...\n");

        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i]>max){
                max= a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("The max Number is :" +max);
        System.out.println("The min Number is : " +min);
    }

}
