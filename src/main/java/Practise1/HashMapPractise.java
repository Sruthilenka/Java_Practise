package Practise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractise {

    public static void main(String[] args){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        map1.put(1,4);
        map1.put(2,8);


        System.out.println(map1);

        for(int i: map1.keySet()){
            System.out.println(i);
        }
        for(int i: map1.values()){
            System.out.println(i);
        }

        Iterator<Integer> it= map1.keySet().iterator();
        while(it.hasNext()){
           int key=it.next();
           int value = map1.get(key);
            System.out.println(key+" "+value);

        }

        Iterator<Integer> it1= map1.values().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


        //Iterating EntrySet
        map1.forEach((k,v)-> System.out.println(k+" "+v));

        //Using Iterator-entryset
        Iterator<Map.Entry<Integer,Integer>> it2= map1.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,Integer> entry = it2.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
