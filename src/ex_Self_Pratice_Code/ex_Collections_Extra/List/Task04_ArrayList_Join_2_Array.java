package ex_Self_Pratice_Code.ex_Collections_Extra.List;

import java.util.*;

public class Task04_ArrayList_Join_2_Array {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Laptop");
        l1.add("Keyboard");
        l1.add("Mouse");
        l1.add("CPU");
        System.out.println("First Array List : "+l1);
        List l2 = new ArrayList();
        l2.add("Printer");
        l2.add("Driver");
        l2.add("Moniter");
        System.out.println("Second Array List : "+l2);
        List l3 = new ArrayList();
        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println("joined Array List : "+l3);
        Iterator iterator = l3.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
