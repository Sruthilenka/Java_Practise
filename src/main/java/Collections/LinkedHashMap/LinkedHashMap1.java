package Collections.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lm1 = new LinkedHashMap<String, String>();
        lm1.put("A", "1");
        lm1.put("B", "2");
        lm1.put("C", "3");
        System.out.println(lm1);

        Iterator<Map.Entry<String,String>> it = lm1.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry =it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
