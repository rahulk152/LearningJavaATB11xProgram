package Interview_program_code;

public class Task_16_Print_Even_Word_In_String {
    public static void main(String[] args) {
        String input = "Sky is blue and vast";
        String[] data = input.split(" ");
        for (String word : data){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
