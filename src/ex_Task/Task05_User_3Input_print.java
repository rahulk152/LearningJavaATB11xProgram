package ex_Task;

import java.util.Scanner;

public class Task05_User_3Input_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary : ");
        float salary = scanner.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
