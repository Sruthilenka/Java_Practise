package Collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedMap {
    public static void main(String[] args){
        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("1","Naveen");
        map1.put("2","Tom");
        map1.put("3","Elena");

        //Create Synchronised MAp
      Map<String,String> syncMap =  Collections.synchronizedMap(map1);
        System.out.println(syncMap);
    }
}
