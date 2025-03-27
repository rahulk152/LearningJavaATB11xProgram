package ex_12_StringBulider_Buffer_Function;

public class Lab062_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rahul");
        stringBuffer.append("Kumar");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder("Rahul");
        stringBuilder.append(123);
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
