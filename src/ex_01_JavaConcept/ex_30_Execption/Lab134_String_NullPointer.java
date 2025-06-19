package ex_01_JavaConcept.ex_30_Execption;

public class Lab134_String_NullPointer {
    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
