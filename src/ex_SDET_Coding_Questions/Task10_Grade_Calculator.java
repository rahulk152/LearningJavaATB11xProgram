package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task10_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number between 0 to 100 : ");
        int num = scanner.nextInt();

        if(num < 0 || num > 100){
            System.out.println("Entered number is not between 0 to 100, Please entre valid number!");
        }else  if (num >= 90 && num <= 100) {
            System.out.println("you got Grade : A+");
        } else if (num >= 80 && num <= 89) {
            System.out.println("you got Grade : A");
        } else if (num >= 70 && num <= 79) {
            System.out.println("you got Grade : B");
        }else if (num >= 60 && num <= 69) {
            System.out.println("you got Grade : C");
        }else if (num >= 50 && num <= 59) {
            System.out.println("you got Grade : D");
        }else if (num >= 40 && num <= 49) {
            System.out.println("you got Grade : E");
        }else {
            System.out.println("you got Grade below 40 : Fail");
        }

    }
}
