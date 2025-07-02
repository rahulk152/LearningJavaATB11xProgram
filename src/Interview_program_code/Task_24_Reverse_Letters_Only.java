package Interview_program_code;

import java.util.Arrays;

public class Task_24_Reverse_Letters_Only {
    public static void main(String[] args) {
        String input = "1ab2";
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = input.length()-1;
        System.out.println("input " +Arrays.toString(inputArray));
        while (left<right){
            if (!Character.isLetter(inputArray[left])) {
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
                right--;
            }else {
                //swap
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Output "+ Arrays.toString(inputArray));
        System.out.println("Output "+ new String(inputArray));
    }
}
