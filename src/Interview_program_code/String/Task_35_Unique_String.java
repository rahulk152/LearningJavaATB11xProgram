package Interview_program_code.String;

import java.util.LinkedHashSet;

public class Task_35_Unique_String {
    public static void main(String[] args) {
        String input = "abbacdabba";
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (char character : inputArray){
            if(set.add(character)){
                sb.append(character);
            }
        }
        System.out.println("Unique character of string in array formate : " +set);

//        for (char ch : set){
//            sb.append(ch);
//        }
        System.out.println("Unique string : " +sb);
    }
}
