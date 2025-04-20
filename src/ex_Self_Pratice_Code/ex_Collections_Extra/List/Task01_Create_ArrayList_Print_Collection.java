package ex_Self_Pratice_Code.ex_Collections_Extra.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Task01_Create_ArrayList_Print_Collection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Pineapple");
        arrayList.add("Guava");
        arrayList.add("Papaya");
        arrayList.add("Plum");
        //Inserting element at first position
        arrayList.addFirst("Grape");
        System.out.println(arrayList);

        System.out.println("---------------");

        //Removing element at index
        arrayList.remove(5);
        System.out.println("Removed item ArrayList : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        System.out.println("---------------");
        System.out.println("Shuffled ArrayList : ");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");

        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList : ");
        for (String s:arrayList){
            System.out.println(s);
        }

       // Collections.reverse(arrayList);
        System.out.println("---------------");
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("---------------");
        System.out.println("\nBackward Direction");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}
