package ex_01_JavaConcept.ex_05_Ternary_Operator;

public class Lab027_Nested_Ternary_Operator {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);
    }
}
