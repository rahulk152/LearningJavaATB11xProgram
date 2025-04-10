package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task06_Entered_value_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an input : ");
        char ch = scanner.next().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println("This is an Alphabet");
        }else {
            System.out.println("This is not an Alphabet");
        }
    }
}
