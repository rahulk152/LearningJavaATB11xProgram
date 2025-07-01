package Interview_program_code;

public class Task_20_Sum_Of_Array {
    public static void main(String[] args) {
        int[] num = {1,24,33,44};
        int sum = 0;
        for (int number : num) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
