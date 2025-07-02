package Interview_program_code.String;

public class Task_26_Reverse_Word_Of_String {
    public static void main(String[] args) {
        String input = "my name is ram";
        char[] words = input.toCharArray();
        String rev = "";
        for(int i = words.length-1;i>=0;i--){
            rev = rev + words[i];
        }
       System.out.println(rev);
    }
}
