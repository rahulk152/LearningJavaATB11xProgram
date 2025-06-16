package Interview_program_code;

public class Task_02_Reverse_String {
    public static void main(String[] args){
        String input = "Automation is fun";
        String[] words = input.split(" ");
        String reverse = "";
        for (int i= words.length-1;i>=0;i--){
        reverse += words[i] + " ";
        }
        System.out.println(reverse.toString().trim());

    }
}
