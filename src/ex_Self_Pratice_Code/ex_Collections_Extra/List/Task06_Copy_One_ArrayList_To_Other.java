package ex_Self_Pratice_Code.ex_Collections_Extra.List;

import java.util.*;

public class Task06_Copy_One_ArrayList_To_Other {
    public static void main(String[] args) {
        List<String> number = new ArrayList();
        number.add("10");
        number.add("25");
        number.add("85");
        number.add("98");
        List<String>  alphabate = new ArrayList();
        alphabate.add("A");
        alphabate.add("B");
        alphabate.add("C");
        alphabate.add("D");
        System.out.println("First List : "+number);
        System.out.println("Second List : "+alphabate);
        Collections.copy(alphabate,number);
        System.out.println("After Copy : ");
        System.out.println("First List : "+number);
        System.out.println("Second List : "+alphabate);
    }
}
