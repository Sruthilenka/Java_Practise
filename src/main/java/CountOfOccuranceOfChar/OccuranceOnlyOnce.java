package CountOfOccuranceOfChar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccuranceOnlyOnce {
    public static void charoccu(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        char[] ch1 = s.toCharArray();
        for (char ch : ch1) {
            if (ch == ' ') {
                continue;
            } else if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        Iterator<Character> it = map1.keySet().iterator();
        while (it.hasNext()) {
            char key = it.next();
            int value = map1.get(key);
            if (value == 1) { //if we want to check for mul occurancees than change it to value>1
                System.out.println(key + " " + value);
            }
        }

        //Method 2 for printing the hashmap
        for (Map.Entry entry : map1.entrySet()) {
            if ((int) entry.getValue() == 1) { //converting obj type to int type
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }


    }


    public static void main(String[] args) {

        charoccu("Sruthiruthisretdhy");
    }
}
