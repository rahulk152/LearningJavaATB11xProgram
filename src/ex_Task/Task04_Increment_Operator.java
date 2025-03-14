package ex_Task;

public class Task04_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
        //ExpA -> 11
        //ExpB -> 11
        //ExpC -> 12
        //ExpA+ExpB+ExpC -> 11+11+12=34
        System.out.println(++a + a++ + a++);
        //value of a -> 13
        System.out.println(a);
    }
}
