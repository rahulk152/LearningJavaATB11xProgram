package ex_01_JavaConcept.ex_14_StringBulider_Buffer_Function;

public class Lab073_StringBuilder_Function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);//Delete Substring
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
