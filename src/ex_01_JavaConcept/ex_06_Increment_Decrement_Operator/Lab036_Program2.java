package ex_01_JavaConcept.ex_06_Increment_Decrement_Operator;

public class Lab036_Program2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);


        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA + ExpB -> 11+12 -> 23, a -> 12
    }
}
