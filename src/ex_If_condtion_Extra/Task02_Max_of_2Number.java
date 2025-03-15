package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task02_Max_of_2Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("The first number is max ");
        }else {
            System.out.println("The second number is max");
        }

    }
}
