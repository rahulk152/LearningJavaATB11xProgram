package ex_05_Ternary_Operator;

public class Lab029_Even_Odd_Number {
    public static void main(String[] args) {
        String s = args[0];
        int n = Integer.parseInt(s);
        String result = (n%2==0) ? "Even Number" : "Odd Number";
        System.out.println(result);
    }
}
