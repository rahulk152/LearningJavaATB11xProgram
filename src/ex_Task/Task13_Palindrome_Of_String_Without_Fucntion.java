package ex_Task;

import java.util.Scanner;

public class Task13_Palindrome_Of_String_Without_Fucntion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.nextLine();
        // Create an empty string to store the reversed string
        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);

        }
        System.out.println("Reversed string: " + reversedStr);
        // Check if the original and reversed strings are the same
        if (str.equals(reversedStr)) {
            System.out.println("The string is a Palindrome!");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

    }
}
