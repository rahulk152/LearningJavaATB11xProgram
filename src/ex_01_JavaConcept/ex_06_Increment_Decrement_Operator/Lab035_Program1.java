package ex_01_JavaConcept.ex_06_Increment_Decrement_Operator;

public class Lab035_Program1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // A+B -> ExpA+ExpB -> 10+12 -> 22 , a -> 12
    }
}
