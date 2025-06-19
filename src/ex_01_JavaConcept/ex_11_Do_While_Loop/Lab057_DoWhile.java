package ex_01_JavaConcept.ex_11_Do_While_Loop;

public class Lab057_DoWhile {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("This is a Body, Which will execute 1 time");
            System.out.println(a);
            a++;
        } while (a < 10);
    }
}
