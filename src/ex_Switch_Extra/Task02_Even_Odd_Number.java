package ex_Switch_Extra;

import java.util.Scanner;

public class Task02_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();

         switch (number%2){
            case 0 -> System.out.println("This is even number");
            case 1 -> System.out.println("This is odd number");

        }
        scanner.close();
    }
}
