package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task04_Number_Divisible_by_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        if(num%3==0){
            System.out.println("Number is divisible by 3");
        }else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
