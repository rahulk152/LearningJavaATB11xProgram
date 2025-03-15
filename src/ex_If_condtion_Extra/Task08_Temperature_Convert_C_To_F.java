package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task08_Temperature_Convert_C_To_F {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        System.out.println("Java Program to convert Celsius to Fahrenheit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Temperature in Celsius");
        celsius= sc.nextFloat();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temp in Fahrenheit = %.2f",fahrenheit);

    }
}
