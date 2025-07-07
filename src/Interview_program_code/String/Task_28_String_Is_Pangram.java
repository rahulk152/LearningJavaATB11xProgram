package Interview_program_code.String;

public class Task_28_String_Is_Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();
        boolean result = checkPangram(input);
        if (result) {
            System.out.println("It's Pangram");
        }else {
            System.out.println("It's not Pangram");
        }
    }

    private static boolean checkPangram(String input) {
        if (input.length()<26) {
            return false;
        }
        for (char i = 'a'; i < 'z'; i++) {
            if (input.indexOf(i)<0) {
                return false;
            }
        }
        return true;
    }
}
