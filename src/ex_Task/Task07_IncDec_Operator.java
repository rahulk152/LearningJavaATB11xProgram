package ex_Task;

public class Task07_IncDec_Operator {
    public static void main(String[] args) {
        int a = 20;
        //ExpA -> 19
        //ExpB -> 19
        //ExpC -> 20
        //ExpA+ExpB+ExpC -> 19+19+20 -> 58
        System.out.println(--a + a++ + a--);
        //Value of a -> 19
        System.out.println(a);
    }
}
