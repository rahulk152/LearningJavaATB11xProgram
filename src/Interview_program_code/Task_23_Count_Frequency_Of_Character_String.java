package Interview_program_code;

import java.util.HashMap;

public class Task_23_Count_Frequency_Of_Character_String {
    public static void main(String[] args) {
        String input = "madam";
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for (char character : inputArray) {
            frequencyMap.put(character,frequencyMap.getOrDefault(character,0)+1);

        }
        for (char ch : frequencyMap.keySet()){
            System.out.println(ch+"   "+frequencyMap.get(ch));
        }
    }

}
