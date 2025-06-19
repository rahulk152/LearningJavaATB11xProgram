package ex_Self_Pratice_Code.ex_Collections_Extra.SET;

import java.util.LinkedHashSet;
import java.util.Set;



public class Task01_Remove_Duplicates_Characters_String {
    public static String removeDuplicates(String input){
        Set<Character> uniqueChars = new LinkedHashSet();
        for (char ch : input.toCharArray()){
            uniqueChars.add(ch);
        }
        // Build result from unique characters
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();

    }
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + output);
    }
}
