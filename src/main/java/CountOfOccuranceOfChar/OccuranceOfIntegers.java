package CountOfOccuranceOfChar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class OccuranceOfIntegers {
    public static void occuint(int[] arr) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : arr) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }


        Iterator<Entry<Integer, Integer>> it = map1.entrySet().iterator();
        while(it.hasNext()) {
            Entry<Integer, Integer> entry = it.next();
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,5,5,3,4,2,3,4,5,7,8,9};
        occuint(arr);
    }
}
