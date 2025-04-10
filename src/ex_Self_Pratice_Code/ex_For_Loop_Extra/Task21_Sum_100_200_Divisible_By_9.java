package ex_Self_Pratice_Code.ex_For_Loop_Extra;

public class Task21_Sum_100_200_Divisible_By_9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200 ; i++) {
            if (i%9 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
