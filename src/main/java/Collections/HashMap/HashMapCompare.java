package Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");


        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        map1.put(3, "C");
        map1.put(1, "A");
        map1.put(2, "B");


        HashMap<Integer,String> map3 = new HashMap<Integer,String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(3, "D");


        //1. Comparision on the basis of key value format
        System.out.println(map1.equals(map2)); //true
        System.out.println(map2.equals(map3)); //false

        //2. compare 2 hashmaps for the same keys - keySet()
        System.out.println(map1.keySet().equals(map2.keySet())); //true
        System.out.println(map2.keySet().equals(map3.keySet())); //true - as set doesnt have duplicates

        //3. Find out the extra keys
        HashMap<Integer,String> map4 = new HashMap<Integer,String>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");
        // --> first combine both the hashmaps : using Hashset
        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        // --> next add key set from map4 too
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);


        // Compare maps by Values
        HashMap<Integer,String> map5 = new HashMap<Integer,String>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");


        HashMap<Integer,String> map6 = new HashMap<Integer,String>();
        map6.put(4, "A");
        map6.put(5, "B");
        map6.put(6, "C");


        HashMap<Integer,String> map7 = new HashMap<Integer,String>();
        map7.put(1, "A");
        map7.put(2, "B");
        map7.put(3, "C");
        map7.put(4, "C");

        // Say while comparing Values they say Duplicates are not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //false

        //Say duplicates are allowed : hashset
            System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //true






    }
}
