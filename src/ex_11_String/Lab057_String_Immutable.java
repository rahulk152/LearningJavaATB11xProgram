package ex_11_String;

public class Lab057_String_Immutable {
    public static void main(String[] args) {
        String name = "Rahul";
        name.toUpperCase();
        System.out.println(name);

        String s1 = "hello";
        s1 = s1.concat("world"); // concat add the values , merge the values
        System.out.println(s1);
    }
}
