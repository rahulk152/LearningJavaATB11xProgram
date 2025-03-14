package ex_Task;

public class Task06_Max_2Number_Ternary_Operator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String result = (num1>num2)?"Your First Number is greater":"Your second Number is greater";
        System.out.println(result);
    }
}
