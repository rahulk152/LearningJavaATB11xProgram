package ex_30_Execption;

public class Lab141_IQ2 {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c; // Vulnerable Code that should be try and catch!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
