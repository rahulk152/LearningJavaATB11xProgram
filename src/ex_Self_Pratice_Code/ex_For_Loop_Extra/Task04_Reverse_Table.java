package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task04_Reverse_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Table : ");
        int t = scanner.nextInt();
        System.out.println("Table of : " +t);
        int table;
        for (int i = 10; i >= 1; i--) {
            table = t * i;
            System.out.println(t+ " * " +i+ " = " +table);

        }
    }
}
