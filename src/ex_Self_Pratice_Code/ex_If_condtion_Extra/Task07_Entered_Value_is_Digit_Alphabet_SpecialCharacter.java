package ex_Self_Pratice_Code.ex_If_condtion_Extra;

import java.util.Scanner;

public class Task07_Entered_Value_is_Digit_Alphabet_SpecialCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input : ");
        char ch = scanner.next().charAt(0);
        if (Character.isAlphabetic(ch)){
            System.out.println("This is an Alphabet");
        } else if (ch >= '0' && ch<='9') {
            System.out.println("This is a digit");
        }else {
            System.out.println("This is Special Character");
        }
    }
}
