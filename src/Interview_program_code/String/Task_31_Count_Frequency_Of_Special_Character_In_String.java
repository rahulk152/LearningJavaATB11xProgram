package Interview_program_code.String;

import java.util.HashMap;

public class Task_31_Count_Frequency_Of_Special_Character_In_String {
    public static void main(String[] args) {
        String s = "ada#@#";
        char[] inputArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : inputArray){
            if (!((ch>='a' && ch<='z') || (ch>='0' && ch<= '9') || (ch>='A' && ch<= 'Z') || (ch == ' '))){
                if (map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                }else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
    }
}
