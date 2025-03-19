package ex_For_Loop_Extra;

import java.util.Scanner;

public class Task12_Print_ASCII_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to know the ASCII : ");
        for (int i = 1; i <= 255; i++) {
            System.out.println((char) i);
        }
    }
}
