package Interview_program_code.Array;

public class Task_05_Missing_Number_In_Array_Finder {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // N = 6
        int missing = findMissingNumber(arr, 6);
        System.out.println("Missing number is: " + missing); // Output: 3
    }
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
