package ex_Self_Pratice_Code.ex_Collections_Extra.List;

import java.util.*;

public class Task05_Empty_Array_List {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList();
        l1.add("Laptop");
        l1.add("Keyboard");
        l1.add("Mouse");
        l1.add("CPU");
        System.out.println("Array List Before Empty : "+l1);

        String s = l1.get(1);
        System.out.println("Retrieve an specific index element : "+s);
        l1.removeAll(l1);
        System.out.println("Array List After Empty : "+l1);


    }
}
