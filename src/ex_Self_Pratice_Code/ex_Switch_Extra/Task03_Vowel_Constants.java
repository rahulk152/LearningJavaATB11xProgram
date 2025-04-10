package ex_Self_Pratice_Code.ex_Switch_Extra;

import java.util.Scanner;

public class Task03_Vowel_Constants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a','A'-> System.out.println("This is Vowel");
            case 'e','E'-> System.out.println("This is Vowel");
            case 'i','I'-> System.out.println("This is Vowel");
            case 'o','O'-> System.out.println("This is Vowel");
            case 'u','U'-> System.out.println("This is Vowel");
            default -> System.out.println("This is Constants");

        }
        scanner.close();
    }
}
