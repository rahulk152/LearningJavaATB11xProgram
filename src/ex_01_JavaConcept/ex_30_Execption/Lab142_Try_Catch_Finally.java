package ex_01_JavaConcept.ex_30_Execption;

public class Lab142_Try_Catch_Finally {
    public static void main(String[] args) {
        int a =1;
        int c = 0;
        try {
            c = 10/2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed!");
        }
    }
}
