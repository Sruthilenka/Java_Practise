package Collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronisedMap2 {
    public static void main(String[] args){
        Map<String,String> map1 = new HashMap<>();
        map1.put("S","P");
        map1.put("T","O");
        map1.put("O","S");
        map1.put("P","T");

       Map<String,String> syncmap =  Collections.synchronizedMap(map1);
        System.out.println(syncmap);

       Iterator<String> it= syncmap.keySet().iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

       Iterator<Map.Entry<String,String>> it1 = syncmap.entrySet().iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

    }
}
