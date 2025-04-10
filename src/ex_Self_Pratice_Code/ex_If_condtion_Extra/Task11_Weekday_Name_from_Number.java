package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task11_Weekday_Name_from_Number {
    public static void main(String[] args) {
//        Write a Java program that takes a number from the user
//        and generates an integer between 1 and 7.
//        It displays the weekday name.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day to know weekday name : ");
        int day = scanner.nextInt();
        if ( day < 0 || day > 7) {
            System.out.println("This is invalid day");
        } else if (day == 1) {
            System.out.println("Today is Monday");
        } else if (day == 2) {
                System.out.println("Today is Tuseday");
        } else if (day == 3) {
                System.out.println("Today is Wenesday");
        } else if (day == 4) {
                System.out.println("Today is Thrusday");
        } else if (day == 5) {
            System.out.println("Today is Friday");
        } else if (day == 6) {
            System.out.println("Today is Saturday");
        }else {
            System.out.println("Today is Sunday");
        }
    }

}
