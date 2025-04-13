package ex_SDET_Coding_Questions.April_12_2025.For_Loop;

public class Task29_Sum_Of_Numbers_from_1_To_100 {
    public static void main(String[] args) {
            int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.print("The Sum of Number from 1 to 100 : ");
        System.out.println(sum);
    }
}
