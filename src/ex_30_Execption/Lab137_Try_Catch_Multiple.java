package ex_30_Execption;

public class Lab137_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
