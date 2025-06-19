package Interview_program_code;

public class Task_07_Reverse_Last_Word {
    public static void main(String[] args) {
        String input = "I Love Java Programming";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                StringBuilder sb = new StringBuilder(words[i]);
                System.out.print(sb.reverse());
            } else {
                System.out.print(words[i] + " ");
            }
        }
    }
}
