package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
    public static void main(String[] args){
        HashMap<String,String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India","NewDelhi");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");
        capitalMap.put("UK","London1");
        capitalMap.put(null,"Berlin");
        capitalMap.put(null,"LA");
        capitalMap.put("Russia",null);
        capitalMap.put("France",null);

        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany")); // returns null
        System.out.println(capitalMap.get("UK")); // gives the latest as key cant be duplicate
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("Russia"));
        System.out.println(capitalMap.get("France"));

        //iterator -->over the keys
        Iterator<String> it = capitalMap.keySet().iterator();
        while(it.hasNext()){
           String key = it.next();
            System.out.println(key);
            String value = capitalMap.get(key);
            System.out.println(value);
            System.out.println("Key ="+key+" Value ="+value);



        //iterator --> over the set: by using entrySet
            Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
            // As we are saving a set, key value pair and for this we need a special Entry class.
            while(it1.hasNext()){
                Entry<String,String> entry = it1.next();
                System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
            }

        //iterate using java 8 for each and lambda method
            System.out.println("**************************");
            capitalMap.forEach((k,v)-> System.out.println("key= "+k+" value= "+v));


        }

    }
}
