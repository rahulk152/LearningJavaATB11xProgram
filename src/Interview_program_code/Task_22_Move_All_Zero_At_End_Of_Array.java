package Interview_program_code;

public class Task_22_Move_All_Zero_At_End_Of_Array {
    public static void main(String[] args) {
        int[] a = {1,0,2,0,3,0};
        int putNonZeroValue = 0;
        for (int current = 0; current < a.length-1; current++) {
            if(a[current] != 0){
                int temp = a[putNonZeroValue];
                a[putNonZeroValue] = a[current];
                a[current] = temp;
                putNonZeroValue++;
            }
        }
        for (int no : a){
            System.out.print(no+ " ");
        }
    }
}
