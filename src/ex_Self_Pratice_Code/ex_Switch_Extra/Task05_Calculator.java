package ex_Self_Pratice_Code.ex_Switch_Extra;

import java.util.Scanner;

public class Task05_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator(+, -, * or /) :");
        char op = scanner.next().charAt(0);
        System.out.println("Enter First Number Value :");
        float num1 = scanner.nextFloat();
        System.out.println("Enter Second Number Value");
        float num2 = scanner.nextFloat();
        float result;

        switch (op){
            case '+':
                result = num1 + num2;
                System.out.println("The result of sum is : " +num1+ " + " +num2+ " = " +result);
                break;
                case '-':
                result = num1 - num2;
                System.out.println("The result of minus is : " +num1+ " - " +num2+ " = "  +result);
                break;
                case '*':
                result = num1 * num2;
                System.out.println("The result of multiply is : " +num1+ " * " +num2+ " = "  +result);
                break;
                case '/':
                result = num1 / num2;
                System.out.println("The result of divide is : " +num1+ " / " +num2+ " = "   +result);
                break;
                default:
                System.out.println("Not an valid operator");
        }
    }
}
