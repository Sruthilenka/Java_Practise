package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args){
        HashMap<String,Integer> compMap = new HashMap<>();
        compMap.put("A",1);
        compMap.put("B",2);
        compMap.put("C",3);
        compMap.put("D",4);
        compMap.put("E",5);

        Iterator it= compMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + "=" +pairs.getValue());
        }

       //convert hashmap keys to arraylist



    }
}
