package ex_Task;

public class Task15_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] number = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = 0;
        int se_max = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
            
                se_max = max;
                max = number[i];

            } else if (number[i] > se_max && number[i] != max) {
                se_max = number[i];
            }

        }
        System.out.println("Max number is " +max);
        System.out.println("Second max number is " +se_max);

    }


}
