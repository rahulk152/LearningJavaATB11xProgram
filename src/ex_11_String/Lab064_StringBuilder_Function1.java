package ex_11_String;

public class Lab064_StringBuilder_Function1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rahul");
        sb.append(" kumar");
        System.out.println(sb);
        sb.insert(5, " Rao");
        System.out.println(sb);
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.substring(6));
        sb.replace(5,9,"");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(1));
        sb.setCharAt(0,'N');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
//        System.out.println(sb.capacity());
//        sb.append("Kumar Rao");
//        System.out.println(sb.capacity());


//        StringBuffer sb1 = new StringBuffer("rahul");
//        System.out.println(sb1.capacity());
//        sb1.append(" kumar rao");
//        System.out.println(sb1.capacity());


    }
}
