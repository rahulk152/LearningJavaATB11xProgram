package Interview_program_code.String;

import java.util.HashSet;

public class Task_29_String_Is_Pangram_CollectionSet {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = checkPangram(input);
        if (result) {
            System.out.println("It's Pangram");
        }else {
            System.out.println("It's not Pangram");
        }
    }

    private static boolean checkPangram(String input) {
        HashSet<Character> characterSet = new HashSet<Character>();
        char[] inputChar = input.toLowerCase().toCharArray();
        for (char c : inputChar){
            if (Character.isLetter(c)) {
                characterSet.add(c);
            }
        }
        if (characterSet.size() == 26) {
            return true;
        }
        return false;
    }
}
