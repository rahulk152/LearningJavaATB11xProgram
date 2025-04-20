package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab161_Linked_List {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
