package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task03_Max_of_3Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Number 3 : ");
        int num3 = scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Max is first Number");
        } else if (num2>num3) {
            System.out.println("Max is second number");
        }else {
            System.out.println("max is third Number");
        }
    }
}
