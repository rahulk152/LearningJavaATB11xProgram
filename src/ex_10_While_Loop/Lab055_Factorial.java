package ex_10_While_Loop;

import java.util.Scanner;

public class Lab055_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the no whose factorial you want!");
        int number = scanner.nextInt();
        int fact = 1;
        int i=1;
        if(number < 0){
            System.out.println(fact);
        }else {
            while(i <= number){
                fact = fact* i;
                i++;
            }
            System.out.println("Factorial : " +fact);
        }

    }
}
