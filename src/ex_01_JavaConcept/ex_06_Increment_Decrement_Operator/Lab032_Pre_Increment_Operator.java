package ex_01_JavaConcept.ex_06_Increment_Decrement_Operator;

public class Lab032_Pre_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // 10+1 -> b -> 11
        System.out.println(b); // 11
        System.out.println(a); // 11


        //  Exp and Result Table
        // Line No | a | Result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)
    }
}
