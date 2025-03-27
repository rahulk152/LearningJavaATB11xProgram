package ex_Task;

public class Task15_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] number = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = 0;
        int second_largest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {

                second_largest = max;
                max = number[i];

            } else if (number[i] > second_largest && number[i] != max) {
                second_largest = number[i];
            }

        }
        System.out.println("Max number is " +max);
        System.out.println("Second max number is " +second_largest);

    }


}
