package ex_01_JavaConcept.ex_05_Ternary_Operator;

public class Lab026_PostiveNegative_Number {
    public static void main(String[] args) {
        String num1 = args[0];
        int num = Integer.parseInt(num1);
        // result = condition ? expression1 : expression2;
        String number = num > 0 ? "This is a Postive Number" : "This is a Negative Number";
        System.out.println(number);
    }
}
