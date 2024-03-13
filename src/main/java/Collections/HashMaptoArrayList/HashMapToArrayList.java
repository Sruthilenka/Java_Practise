package Collections.HashMaptoArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapToArrayList {
    public static void main(String[] args){
        ConcurrentHashMap<String,String> cmp = new ConcurrentHashMap<String,String>(){{
            put("A","B");
            put("C","D");
            put("E","F");
            put("G","H");
        }};

        System.out.println("Size: "+cmp.size());
        Iterator<Map.Entry<String,String>> it = cmp.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //making an arraylist of hashmap keys
        ArrayList<String> ar1 = new ArrayList<String>(cmp.keySet());
        for(String s:ar1){
            System.out.println(s);
        }


        //making an arraylist of hashmap values
        ArrayList<String> ar2 = new ArrayList<String>(cmp.values());
        for(String s:ar2){
            System.out.println(s);
        }
    }
}
