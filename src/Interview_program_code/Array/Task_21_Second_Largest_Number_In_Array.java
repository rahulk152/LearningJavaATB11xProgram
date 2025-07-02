package Interview_program_code.Array;

public class Task_21_Second_Largest_Number_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,2,7,5};
        int largestNo = Integer.MIN_VALUE;
        int secondLargestNo = Integer.MIN_VALUE;

        for (int no : arr) {
            if(no > largestNo){
                secondLargestNo = largestNo;
                largestNo = no;
            }else if (no> secondLargestNo && no != largestNo){
                secondLargestNo = no;
            }


        }

        System.out.println("The Second Largest Number is : " +secondLargestNo);

    }
}
