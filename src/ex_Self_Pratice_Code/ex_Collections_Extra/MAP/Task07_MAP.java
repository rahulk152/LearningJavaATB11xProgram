package ex_Self_Pratice_Code.ex_Collections_Extra.MAP;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task07_MAP {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        hash_map.put(1, "Pink");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        System.out.println("Count Number of Key-Value in HashMap : "+hash_map.size());

        HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
        hash_map1.put(6, "Yello");
        hash_map1.put(7, "Purple");
        hash_map1.put(8, "Brown");
        hash_map1.putAll(hash_map);

        for (Map.Entry hs : hash_map1.entrySet()){
            System.out.println(hs.getKey()+ " "+hs.getValue());
        }



        System.out.println("-------------------------");

        for (HashMap.Entry hs : hash_map.entrySet()){
            System.out.println(hs.getKey()+" "+hs.getValue());
        }
    }
}
