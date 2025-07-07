package Interview_program_code.String;

public class Task_27_Replace_Vowel_With_X {
    public static void main(String[] args) {
        String input = "Name";
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
            for (char word : inputArray){
               if (isVowel(word)) {
                   sb.append('x');
               }else {
                   sb.append(word);
               }
           }
        System.out.println("The Replaced Vowel String is : " +sb);

    }
    public static boolean isVowel(char word){
        if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u'
                || word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U') {
            return true;
        }else {
            return false;
        }
    }
}
