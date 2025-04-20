package ex_Self_Pratice_Code.ex_Collections_Extra.List;

import java.util.*;

public class Task03_ArrayList_Swap_Elements {
    public static void main(String[] args) {
        ArrayList<String> list_col= new ArrayList();
        list_col.add("Black");
        list_col.add("Orange");
        list_col.add("Pink");
        list_col.add("Blue");
        list_col.add("White");
        list_col.add("Yellow");

        for (String s : list_col){
            System.out.println(s);
        }
        System.out.println("----------------");

        list_col.set(1,"Peach");
        System.out.println(list_col);

        System.out.println("----------------");
        System.out.println(list_col.contains("Pink"));
        System.out.println("----------------");

        Collections.swap(list_col,1,4);
        System.out.println("Array List after swap : ");
        for(String b: list_col)
        {
            System.out.println(b);
        }

    }
}
