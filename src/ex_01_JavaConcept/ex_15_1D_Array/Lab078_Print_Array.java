package ex_01_JavaConcept.ex_15_1D_Array;

import java.util.Arrays;

public class Lab078_Print_Array {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

    }
}
