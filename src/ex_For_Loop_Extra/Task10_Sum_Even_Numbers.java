package ex_For_Loop_Extra;

import java.util.Scanner;

public class Task10_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number limit to sum the even number : ");
        int e = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= e; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
