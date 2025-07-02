package Interview_program_code.String;

public class Task_14_String_Last_Word_Count {
    public static void main(String[] args) {
        String s = "      Hello     World     ";
        int count = 0;
        s.trim();
        char inputArray[] = s.toCharArray();
        for (int i = inputArray.length-1; i >= 0 ; i--) {
            if (inputArray[i]!=' ') {
                count= count+1;
            }
            else{
                if (count>0){
                    System.out.println(count);
                    break;
                }
            }
        }

    }
}
