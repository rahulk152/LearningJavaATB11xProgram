package ex_Task;

import java.util.Scanner;

public class Task13_Palindrome_Of_String_With_Fucntion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string, check it's Palindrome : ");
        String userInput = scanner.next();
        String newString = reverseString(userInput);
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }

    private static String reverseString(String userInput) {

        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;
    }
    private static String reverseStringSB(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }
}
