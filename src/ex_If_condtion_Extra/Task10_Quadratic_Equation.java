package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task10_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input of a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter Input of b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter Input of c : ");
        double c = scanner.nextDouble();

        double result = b * b - 4.0 * a * c;

        if(result > 0.0){
            double r1 = (-b + Math.pow(result,0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result,0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println();
        }else {
            System.out.println("The equation has no real roots.");
        }
    }
}
