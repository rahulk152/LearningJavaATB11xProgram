package Interview_program_code;

public class Task_18_Missing_Array_Element_Bitwise {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int missingNumber = 0;
        for (int num : arr){
            missingNumber = missingNumber ^ num;
        }
        for (int i = 0; i <= 6; i++) {
            missingNumber = missingNumber ^ i;
        }
        System.out.println("The missing elemnt in Array is :" +missingNumber);
    }
}
