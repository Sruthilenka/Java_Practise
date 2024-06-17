package SortedArrayRemoveDup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class pracdupremove {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 3, 2, 1, 4};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : arr) {
         map1.put(i,i);
        }
        map1.forEach((k,v)-> System.out.println("key: "+k+"value: "+v));
        Iterator<Integer> it = map1.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Integer[] arr2= map1.keySet().toArray(new Integer[0]);
    }
}
