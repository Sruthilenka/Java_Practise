package Collections.HashMap2;

import java.util.Collections;
import java.util.Map;

public class SingletonMap {
    public static void main(String[] args){
        Map<String,Integer> map1 = Collections.singletonMap("Tom",10);
        System.out.println(map1.get("Tom"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
