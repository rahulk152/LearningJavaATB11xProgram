package Interview_program_code;

public class Task_17_Missing_Number_In_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        int n = 6;
        int sumOfTotal = n*(n+1)/2;
        int missingNumber;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        missingNumber = sumOfTotal - sum;
        System.out.println("Missing Number in Array is : " +missingNumber);
    }
}
