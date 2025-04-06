package ex_SDET_Coding_Questions.April_4_2025;

import java.util.Scanner;

public class Task03_Character_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character to know it's Vowel or Consonant : ");
        char char1 = scanner.next().charAt(0);
        char ch = Character.toLowerCase(char1);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("This is a Vowel");
        }else {
            System.out.println("This is a Consonant");
        }

    }
}
