package ex_Array_Extra;

public class Task03_Sum_And_Average_Of_Array {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum_of_array = 0;


        for (int i = 0; i < Array.length; i++) {
            sum_of_array = sum_of_array + Array[i];
        }

        System.out.println("Sum of the array : " +sum_of_array);
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double avegare = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        avegare = sum/arr.length;
        System.out.println("The Average of the array is : " +avegare);
    }
}
