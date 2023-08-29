package Collections.HashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {
    public static void main(String[] args){
        //never throws concurrentModificationException because of its implementation of Segments lock
        ConcurrentHashMap<String,String> concMap = new ConcurrentHashMap<>();
        concMap.put("Tom","Elena");
        concMap.put("Master","Student");
        concMap.put("Golden","Goose");

        System.out.println(concMap.get("Tom"));

    }
}
