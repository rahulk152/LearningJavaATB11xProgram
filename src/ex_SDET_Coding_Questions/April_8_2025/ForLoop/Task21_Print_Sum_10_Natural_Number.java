package ex_SDET_Coding_Questions.April_8_2025.ForLoop;

public class Task21_Print_Sum_10_Natural_Number {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum +i;
        }
        System.out.println("The Sum of First 10 Natural Number is : " +sum);
    }
}
