package ex_13_Array;

public class Lab071_Sum_Of_Array {
    public static void main(String[] args) {
        int[] number = {12, 34, 10};
        int sum = 0; // ->12 + 34 + 10 ->56
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);

        int[] numbers = {12, 34, 10};
        int sum1 = 0; // ->12 + 34 + 10 ->56
        for(int n : numbers ){
            sum1 = sum1 + n;
        }
        System.out.println(sum1);
    }
}
