package ex_Switch_Extra;

import java.util.Scanner;

public class Task07_Menu_Driven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please Select option from (1-4) : ");
        int option = scanner.nextInt();
        System.out.println("Enter first Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        int result;
        switch (option){
            case 1:
                result = num1 + num2;
                System.out.println(num1+ " + " +num2+ " = " +result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1+ " - " +num2+ " = " +result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1+ " * " +num2+ " = " +result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println(num1+ " / " +num2+ " = " +result);
                break;
            default:
                System.out.println("Invalid option");

        }

    }
}
