package Collections.HashMap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingKeyValuePairHM {
    public static void main(String[] args){
        HashMap<String,String> hm1 = new HashMap<String,String>(){{
                put("apple", "10");
                put("banana", "20");
                put("cherry", "30");
            }};
       Iterator<Map.Entry<String,String>> it= hm1.entrySet().iterator();
       while(it.hasNext()){

           Map.Entry<String,String> entry = it.next();
           System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
       }

    }
}
