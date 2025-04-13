package ex_SDET_Coding_Questions.April_12_2025.While_Loop;

public class Task38_Sum_Of_Numbers_from_1_To_100 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.print("The Sum of 100 Number is : ");
        System.out.println(sum);
    }
}
