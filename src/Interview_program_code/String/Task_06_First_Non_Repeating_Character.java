package Interview_program_code.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_06_First_Non_Repeating_Character {
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // If no non-repeating character found
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingChar(input);
        System.out.println("First non-repeating character: " + result); // Output: w
    }
}
