package Collections.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class DescendingOrderTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tree1 = new TreeMap<String, Integer>(Comparator.reverseOrder()) {{
            put("Sruthi", 1);
            put("Lenka", 2);
            put("Vodka", 3);
            put("Whisky", 4);

        }};

        System.out.println(tree1);

    }
}
