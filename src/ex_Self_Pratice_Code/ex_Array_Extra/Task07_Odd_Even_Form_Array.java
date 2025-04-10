package ex_Self_Pratice_Code.ex_Array_Extra;

import java.util.Scanner;

public class Task07_Odd_Even_Form_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of the array : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.printf("Element a[%d] :",j);
            a[j] = scanner.nextInt();
        }
        System.out.println("The Array is :");
        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0){
                System.out.println("This is even Number " +a[i]);
                even = even + a[i];
            }
            else {
                System.out.println("This is Odd Number " +a[i]);
                odd = odd +a[i];
            }
        }
        System.out.println("The Sum of even Number is : " +even);
        System.out.println("The Sum of Odd Number is : " +odd);
    }
}
