package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task05_Enter_Value_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input : ");
        char ch = scanner.next().charAt(0);
        if (ch>='0' && ch<='9'){
            System.out.println("This is a Digit");
        }else {
            System.out.println("This is not a digit");
        }
    }
}
