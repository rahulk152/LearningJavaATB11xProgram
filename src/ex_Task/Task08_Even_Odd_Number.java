package ex_Task;

import java.util.Scanner;

public class Task08_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("This is an Even Number");
        }else {
            System.out.println("This is an Odd number");
        }
    }
}
