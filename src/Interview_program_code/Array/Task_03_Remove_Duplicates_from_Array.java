package Interview_program_code.Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task_03_Remove_Duplicates_from_Array {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num:input){
        uniqueSet.add(num);
        }
        // Convert set back to array
        int[] output = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            output[i++] = num;
        }

        // Print the result
        System.out.println("Output: " + Arrays.toString(output));
    }
}
