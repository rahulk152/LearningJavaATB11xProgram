package ex_Task;

import java.util.Scanner;

public class Task10_Fibonacci_Sequence_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for Fibonacci sequence : ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 2; i < n; i++) {
        int next = first + second;
        System.out.print(", " + next);
        first = second;
        second = next;

        }
        scanner.close();
    }
}
