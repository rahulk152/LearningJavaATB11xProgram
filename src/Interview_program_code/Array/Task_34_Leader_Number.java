package Interview_program_code.Array;

public class Task_34_Leader_Number {
    public static void main(String[] args) {
        int[] a = {16,17,4,3,5,2};
        int length = a.length;
        int maxRight = a[length-1];
        System.out.println(maxRight);
        for (int index = length-2; index >= 0 ; index--) {
            if (a[index] > maxRight) {
                maxRight = a[index];
                System.out.println(maxRight);
            }
        }
    }
}
