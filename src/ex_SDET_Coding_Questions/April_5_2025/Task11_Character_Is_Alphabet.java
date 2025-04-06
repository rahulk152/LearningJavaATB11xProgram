package ex_SDET_Coding_Questions.April_5_2025;

import java.util.Scanner;

public class Task11_Character_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character to know it's Alphabet");
        char ch = scanner.next().charAt(0);

        if(Character.isAlphabetic(ch)){
            System.out.println("This is an Alphabet");
        }else {
            System.out.println("This is not an Alphabet");
        }
    }
}
