package ex_SDET_Coding_Questions.April_8_2025.WhileLoop;

public class Task26_Sum_Of_First_10_Natural_Numbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("The Sum Of First 10 Natural Number is : " +sum);
    }
}
