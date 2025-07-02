package Interview_program_code;

import java.util.Arrays;

public class Task_25_Reverse_Vowel_Only {
    public static void main(String[] args) {
        String input = "Hello";
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length-1;
        String vowel = "aeiouAEIOU";
        while (left<right){
            if (vowel.indexOf(inputArray[left])==-1) {
                left++;
            } else if (vowel.indexOf(inputArray[right])==-1) {
                right--;
            }else {
                char temp = inputArray[left];
                inputArray[left]= inputArray[right];
                inputArray[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println("Output "+ Arrays.toString(inputArray));
        System.out.println("Output "+ new String(inputArray));
    }
}
