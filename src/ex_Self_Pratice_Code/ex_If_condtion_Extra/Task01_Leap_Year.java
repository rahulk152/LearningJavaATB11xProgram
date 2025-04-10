package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task01_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println("This is a Leap Year");
        }else {
            System.out.println("This is not a Leap Year");
        }
    }
}
