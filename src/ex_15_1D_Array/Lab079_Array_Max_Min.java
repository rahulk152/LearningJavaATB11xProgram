package ex_15_1D_Array;

public class Lab079_Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Can we take the input from user also? = Yes - later
        // Max and Min

        // Max
        int max_output = max_number(array);
        System.out.println("Maximum Number is : " +max_output);
        int min_output = min_number(array);
        System.out.println("Minmum Number is : " +min_output);
    }


    private static int max_number(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    private static int min_number(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
