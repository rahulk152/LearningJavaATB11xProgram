package ex_01_JavaConcept.ex_30_Execption;

public class Lab140_IQ {
    public static void main(String[] args) {
        try {
            String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsExceptio
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a;//
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }
    }
}
