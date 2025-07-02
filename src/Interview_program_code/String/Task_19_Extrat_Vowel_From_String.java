package Interview_program_code.String;

public class Task_19_Extrat_Vowel_From_String {
    public static void main(String[] args) {
        String str = "your Name";
        char inputArray[] = str.toLowerCase().toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            char ch = inputArray[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }
        }
    }


}
