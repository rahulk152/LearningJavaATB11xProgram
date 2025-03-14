package ex_Task;

import java.util.Scanner;

public class Task09_Triangle_Classifier {
    public static void main(String[] args) {
//        Write a program that classifies a triangle based on its side lengths.
//        Given three input values representing the lengths of the sides, determine
//        if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal),
//        or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle : ");
        int s1 = scanner.nextInt();
        System.out.println("Enter second side of triangle : ");
        int s2 = scanner.nextInt();
        System.out.println("Enter third side of triangle : ");
        int s3 = scanner.nextInt();

        if (s1==s2 && s2==s3){
            System.out.println("This is an equilateral triangle as all the sides are equal!");
        } else if (s1==s2 || s2==s3 || s3==s1) {
            System.out.println("This is an isosceles triangle, exactly two sides are equal");
        }else {
            System.out.println("This is an scalene triangle, no sides are equal");
        }

    }
}
