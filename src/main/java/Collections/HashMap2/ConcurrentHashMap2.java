package Collections.HashMap2;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap2 {
    public static void main(String[] args){
        ConcurrentHashMap<String,String> cmp = new ConcurrentHashMap<String,String>(){{
            put("A","B");
            put("C","D");
            put("E","F");
            put("G","H");
        }};

        System.out.println(cmp.get("A"));



    }
}
